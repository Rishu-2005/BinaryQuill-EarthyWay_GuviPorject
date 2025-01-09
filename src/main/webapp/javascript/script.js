/**
 * 
 */

document.addEventListener("DOMContentLoaded", function() {
    // Get elements
    const loginButton = document.getElementById('login');
    const registerButton = document.getElementById('registerbt');
    const searchForm = document.querySelector('.locationsetter form');
    const pickupLocation = searchForm.querySelector('input[placeholder="Pickup Location"]');
    const dropOffLocation = searchForm.querySelector('input[placeholder="Drop-Off Location"]');
    const dateInput = searchForm.querySelector('input[type="date"]');

    // Event listener for the Login/SignUp button
    loginButton.addEventListener("click", function() {
        window.location.href = "../signup.jsp"; // Redirect to sign-in page (adjust path as needed)
    });

    // Event listener for the Register Now button
    registerButton.addEventListener("click", function() {
        window.location.href = "../register.jsp"; // Redirect to register page (adjust path as needed)
    });

    // Event listener for the search form (Pickup Location, Drop-Off Location, and Date)
    searchForm.addEventListener("submit", function(event) {
        event.preventDefault(); // Prevent the form from refreshing the page

        // Get the values from the inputs
        const pickupValue = pickupLocation.value.trim();
        const dropOffValue = dropOffLocation.value.trim();
        const dateValue = dateInput.value.trim();

        // Validate the input fields
        if (!pickupValue || !dropOffValue || !dateValue) {
            alert("Please fill in all fields to search.");
        } else {
            // For now, show an alert with the entered values
            alert(`Searching for vehicles from ${pickupValue} to ${dropOffValue} on ${dateValue}`);

            // After validation, you can redirect to another page for the search results, e.g.:
            // window.location.href = `search-results.html?pickup=${pickupValue}&dropoff=${dropOffValue}&date=${dateValue}`;
        }
    });
});