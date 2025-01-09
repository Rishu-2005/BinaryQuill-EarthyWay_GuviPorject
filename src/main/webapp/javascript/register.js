/**
 * 
 */

document.addEventListener('DOMContentLoaded', () => {
    const form = document.querySelector('.signin form');
    const registerButton = document.querySelector('.button');
    const inputs = form.querySelectorAll('input');
    const termsCheckbox = document.getElementById('terms');
    
    registerButton.addEventListener('click', (e) => {
        e.preventDefault();

        // Clear previous error messages
        document.querySelectorAll('.error').forEach(err => err.remove());

        let isValid = true;

        // Full name validation
        const fullName = inputs[0];
        if (!fullName.value.trim()) {
            showError(fullName, 'Full name is required.');
            isValid = false;
        }

        // Email validation
        const email = inputs[1];
        if (!email.value.trim() || !isValidEmail(email.value)) {
            showError(email, 'A valid email is required.');
            isValid = false;
        }

        // Phone number validation
        const phoneNumber = inputs[2];
        if (!phoneNumber.value.trim() || !/^\d{10}$/.test(phoneNumber.value)) {
            showError(phoneNumber, 'Enter a valid 10-digit phone number.');
            isValid = false;
        }

        // Password validation
        const password = inputs[3];
        if (!password.value.trim() || password.value.length < 6) {
            showError(password, 'Password must be at least 6 characters long.');
            isValid = false;
        }

        // Confirm password validation
        const confirmPassword = inputs[4];
        if (confirmPassword.value !== password.value) {
            showError(confirmPassword, 'Passwords do not match.');
            isValid = false;
        }

        // Terms and conditions validation
        if (!termsCheckbox.checked) {
            const termsError = document.createElement('p');
            termsError.className = 'error';
            termsError.textContent = 'You must agree to the Terms and Conditions.';
            termsCheckbox.parentNode.appendChild(termsError);
            isValid = false;
        }

       /* if (isValid) {
            alert('Form submitted successfully!');
            form.reset(); // Clear the form after submission
        }*/
    });

    // Utility functions
    function showError(input, message) {
        const error = document.createElement('p');
        error.className = 'error';
        error.textContent = message;
        error.style.color = 'red';
        input.parentNode.insertBefore(error, input.nextSibling);
    }

    function isValidEmail(email) {
        return /^[^\s@]+@[^\s@]+\.[^\s@]+$/.test(email);
    }
});