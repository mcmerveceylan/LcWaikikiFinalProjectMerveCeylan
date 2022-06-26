package pages;


    import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import util.ElementHelper;

    public class LoginPage {
        String mailAdress="testlcw@gmail.com";
        String loginPageUrl="https://www.lcwaikiki.com/tr-TR/TR/giris";
        By logo= By.className("main-header-logo");
        By emailInput = By.name("email");
        By emailInputPlaceHolder = By.className("text-input");
        By passwordInput = By.name("password");
        By rememberMeCheckbox = By.name("rememberMe");
        By errorElement = By.className("error");
        By passwordInputPlaceHolder = By.className("text-input");
        By passwordIcon = By.className("login-form__show-password-icon--img");
        By loginButton= By.className("login-form__button");
        By loginButtonOnLoginPage= By.className("login-form__button");

        WebDriver driver;
        ElementHelper helper;
        public LoginPage(WebDriver driver) {
            this.driver = driver;
            this.helper = new ElementHelper(driver);
        }
        public void checkLogoAppear() {
            helper.checkElementVisible(logo);
        }
        public void clickLogin() {
            helper.click(loginButton);
        }

        public void clickLogin(String text) {
            helper.clickElementWithText(loginButton,text);
        }
        public void checkTextMailInput(String text) {
            helper.clickElementWithText(emailInputPlaceHolder,text);
        }
        public void checkTextPasswordInput(String text) {
            helper.clickElementWithText(passwordInputPlaceHolder,text);
        }
        public void checkPasswordIconAppear() {
            helper.checkElementVisible(passwordIcon);
        }
        public void checkRememberMeAppear() {
            helper.checkElementVisible(rememberMeCheckbox);
        }
        public void checkLoginButtonAppear() {
            helper.checkElementVisible(loginButton);
        }
        public void assertError(String text) {
            helper.checkElementWithText(errorElement,text);
        }
        public void assertFalseError( ) {
            helper.checkElementVisible(errorElement);
        }

        public void checkForgotPasswordAppear() {
            helper.checkElementVisible(rememberMeCheckbox);
        }

        public void typeEmail(String text) {
            helper.sendKey(emailInput,text);
        }
        public void typePassword(String text) {
            helper.sendKey(passwordInput,text);
        }
        public void checkEmailRadioButtonAppear(String text) {
            helper.checkElementWithText(loginButtonOnLoginPage,text);
        }
        public void checkPhoneRadioButtonAppear(String text) {
            helper.checkElementWithText(loginButtonOnLoginPage,text);
        }
        public void assertLoginPageAppear() {
            helper.assertUrl(loginPageUrl);
        }
    }

