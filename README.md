# ATM Interface
* Project Overview
    The ATM Interface Project is a Java-based desktop application that simulates the fundamental operations of a real-world ATM. It is designed using Java Swing 
    for the Graphical User Interface (GUI), applying Object-Oriented Programming (OOP) principles for structured and modular code development. The application 
    allows users to interact with a virtual ATM, performing common banking transactions such as deposits, withdrawals, and balance inquiries.

* Key Features
  ~Deposit Functionality
     Users can enter an amount to deposit into their virtual account.
     Validations ensure only positive amounts are accepted.
     The account balance updates dynamically after each transaction.

  ~Withdrawal Functionality
     Users can withdraw money from their account by entering the desired amount.
     Validates sufficient balance before processing the transaction.
     Displays an error message if the user tries to withdraw more than the available balance.

  ~Balance Inquiry
     Users can check the current account balance at any time.
     The balance is displayed in a user-friendly format using a pop-up dialog.

  ~Graphical User Interface (GUI)
     Developed using Java Swing components: JFrame, JPanel, JLabel, JButton, JTextField, and JOptionPane.
     The GUI is intuitive and easy to navigate, enhancing user experience.

  ~Event Handling
     The project uses ActionListeners to handle button clicks and trigger corresponding actions for each feature.

  ~Modular Code Structure
     The project is divided into three classes:
         ATM: Contains the core logic and data members like balance.
         BankAccount: Represents user accounts and manages transactions.
         ATMInterface: Builds the GUI and connects the user actions to the core logic.

   ~Error Handling
      Input validations ensure that users cannot deposit or withdraw invalid amounts.
      The application provides meaningful error messages using dialog boxes (JOptionPane), guiding users in case of incorrect inputs.

* Technologies and Tools Used
Java (JDK) – Programming language

Swing API – GUI development

NetBeans IDE – Development environment

OOP Concepts – For code modularity and maintainability


-------------------------------------------------------------------------------------------------------------------------------------------------------------------
