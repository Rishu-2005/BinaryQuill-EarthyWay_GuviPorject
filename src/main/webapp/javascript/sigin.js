/**
 * 
 */
document.addEventListener('DOMContentLoaded', () => {
    // Button elements
    const googleSignInButton = document.getElementById('sigingoogle');
    const appleSignInButton = document.getElementById('signinapple');
    const loginButton = document.getElementById('nextbt');
    const forgetPasswordButton = document.getElementById('forgetpswd');
    const usernameInput = document.getElementById('username');
    const passwordInput = document.getElementById('password');

    // Event listener for Google Sign-In
    googleSignInButton.addEventListener('click', () => {
        //alert('Google Sign-In is currently under development.');
        window.onload = function () {
            google.accounts.id.initialize({
                client_id: 'YOUR_GOOGLE_CLIENT_ID',
                callback: handleCredentialResponse
            });
            google.accounts.id.prompt();
        };
        // Add Google OAuth logic here
    });

    // Event listener for Apple Sign-In
    appleSignInButton.addEventListener('click', () => {
       // alert('Apple Sign-In is currently under development.');
        // Add Apple OAuth logic here
    });

    // Event listener for Login Button
    loginButton.addEventListener('click', (e) => {
        e.preventDefault();
        
        // Clear previous error messages
        document.querySelectorAll('.error').forEach(err => err.remove());

        let isValid = true;

        // Validate username/email
        if (!usernameInput.value.trim()) {
            showError(usernameInput, 'Username/Email is required.');
            isValid = false;
        }

        // Validate password
        if (!passwordInput.value.trim()) {
            showError(passwordInput, 'Password is required.');
            isValid = false;
        }

        if (isValid) {
            alert('Successfully Logged In!');
            window.location.href = '../index.jsp';
            // Redirect to homepage or dashboard after successful login
            // window.location.href = '/dashboard.html'; // Uncomment this line to redirect
        }
    });

    // Event listener for Forgot Password Button
    forgetPasswordButton.addEventListener('click', () => {
        alert('Redirecting to Forgot Password page...');
        // Redirect to Forgot Password page if needed
        // window.location.href = '/forgot-password.html'; // Uncomment this line to redirect
    });

    // Utility function to show error message
    function showError(input, message) {
        const error = document.createElement('p');
        error.className = 'error';
        error.textContent = message;
        error.style.color = 'red';
        input.parentNode.insertBefore(error, input.nextSibling);
    }
});