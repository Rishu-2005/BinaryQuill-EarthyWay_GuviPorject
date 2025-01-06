/**
 * 
 */

document.addEventListener('DOMContentLoaded', () => {
    // Button Elements
    const createAccountButton = document.getElementById('createaccbt');
    const signInButton = document.getElementById('signinbt');
    const navbarLoginButton = document.getElementById('login');

    // Event Listeners for Buttons
    createAccountButton.addEventListener('click', () => {
        window.location.href = 'register.jsp'; // Redirect to Create Account page
    });

    signInButton.addEventListener('click', () => {
        window.location.href = 'signin.jsp'; // Redirect to Sign-In page
    });

    navbarLoginButton.addEventListener('click', () => {
        window.location.href = 'signup.jsp'; // Redirect to Login/SignUp page
    });
});