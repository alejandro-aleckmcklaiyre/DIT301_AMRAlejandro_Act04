# DIT301_AMRAlejandro_Act04# EventPracticeApp

## Event Handling Implementation
For this app, I implemented event handling using a simple `OnClickListener` on the **Submit** button.  
When the user clicks the button, the app retrieves the text from the **Name** and **Age** fields, checks if they're not empty, and attempts to convert the age input into a number.  

If everything works correctly, it displays a message such as:

> "Hello John! You are 20 years old."

This interaction is handled in the `MainActivity` with just a few lines of code that process the button click event.

---

## Techniques for Smooth and Stable Interaction
To make the user experience smoother and avoid crashes, I added several safety and validation checks:

- Both fields must have input before any processing occurs.  
- The **Age** field restricts the input to numbers only, preventing users from entering letters.  
- A `try-catch` block is used to safely convert the age to an integer, showing a **Toast** message saying `"Invalid age."` if conversion fails.  
- **Toast messages** appear when something goes wrong, giving the user feedback instead of letting the app silently fail.

These small checks make the app more stable and user-friendly.

---

## Future Improvements
If I were to enhance this app further, I would consider adding:

- **ViewBinding** – to make code cleaner and safer when referencing views.  
- **ViewModel for state saving** – so inputs persist even when the phone is rotated.  
- **Real-time validation** – show errors while typing, not just after pressing submit.  
- **Clear button** – for quickly resetting the form.  
- **UI animations** – make the output appear with a smooth animation for a pol
