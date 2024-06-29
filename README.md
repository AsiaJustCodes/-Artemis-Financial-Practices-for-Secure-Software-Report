#  Artemis Financial Practices for Secure Software Report

# Briefly summarize your client, Artemis Financial, and its software requirements. Who was the client? What issue did the company want you to address? 

Artemis Financial is a consulting company that develops individualized financial plans for customers. They needed to modernize their operations with enhanced software security, specifically by adding a file verification step to ensure secure communications using checksums during data transfers.

# What did you do well when you found your client’s software security vulnerabilities? Why is it important to code securely? What value does software security add to a company’s overall well being? 

I successfully identified and addressed software security vulnerabilities by implementing encryption and secure communication protocols. Coding securely is particularly important to prevent data breaches and maintain client trust. Enhanced security contributes to the company's overall well being by protecting sensitive information and reducing legal and financial risks.

# Which part of the vulnerability assessment was challenging or helpful to you?

The most challenging part was ensuring the encryption and secure communication were correctly implemented. This involved generating and deploying certificates and configuring HTTPS. It was also helpful as it improved my understanding of secure communication protocols.

# How did you increase layers of security? In the future, what would you use to assess vulnerabilities and decide which mitigation techniques to use? 

I increased security layers by implementing AES 256 encryption, generating self signed certificates, and converting HTTP to HTTPS. In the future, I would use tools like OWASP Dependency Check, static code analyzers, and regular security audits to assess vulnerabilities and decide on mitigation techniques.

# How did you make certain the code and software application were functional and secure? After refactoring the code, how did you check to see whether you introduced new vulnerabilities?

To ensure functionality and security, I conducted unit tests and manual code reviews. After refactoring, I used the dependency check tool and secondary static testing to verify no new vulnerabilities were introduced.

# What resources, tools, or coding practices did you use that might be helpful in future assignments or tasks?
Tools like OWASP Dependency Check, Java Keytool for certificate generation, and secure coding practices were invaluable. These will be beneficial for future tasks involving secure software development.

# Employers sometimes ask for examples of work that you have successfully completed to show your skills, knowledge, and experience. What might you show future employers from this assignment?

For any future employers I plan on showcasing the knowledge and skills I've obtained along the way such as, 
learning mitigating techniques with software, static testing, and implementing encryption.

