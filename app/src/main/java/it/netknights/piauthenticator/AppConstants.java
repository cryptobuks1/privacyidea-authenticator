package it.netknights.piauthenticator;

public class AppConstants {

    static final String APP_TITLE = " privacyIDEA Authenticator";
    static final String PACKAGE_NAME = "it.netknights.piauthenticator";
    static String TAG = "it.netknights.piauth";

    enum TokenType {
        TOTP, HOTP, PUSH
    }

    static final int INTENT_ADD_TOKEN_MANUALLY = 101;
    static final int INTENT_ABOUT = 102;
    static final int PERMISSIONS_REQUEST_CAMERA = 103;

    static final String CRYPT_ALGORITHM = "AES/GCM/NoPadding";
    static final int KEY_LENGTH = 16;
    static final int IV_LENGTH = 12;

    // ----- FILE NAMES -----
    static final String DATAFILE = "data.dat";
    static final String KEYFILE = "key.key";
    static final String FB_CONFIG_FILE = "fbconf.dat";
    // -----------------------

    static final String DIGITS = "digits";
    static final String PERIOD = "period";
    static final String ALGORITHM = "algorithm";
    static final String ISSUER = "issuer";
    static final String SECRET = "secret";
    static final String TYPE = "type";
    static final String LABEL = "label";
    static final String COUNTER = "counter";
    static final String TOTP = "totp";
    static final String HOTP = "hotp";
    static final String TAPTOSHOW = "taptoshow";
    static final String PIN = "pin";
    static final String WITHPIN = "withpin";
    static final String TWOSTEP_SALT = "2step_salt";
    static final String TWOSTEP_DIFFICULTY = "2step_difficulty"; // pbkdf2 iterations
    static final String TWOSTEP_OUTPUT = "2step_output"; // length of the key generated by the smartphone in byte
    static final String PROPERTY_PROGRESS = "progress";
    static final String PERSISTENT = "undeletable";

    static final String SHA1 = "SHA1";
    static final String SHA256 = "SHA256";
    static final String SHA512 = "SHA512";
    static final String HMACSHA1 = "HmacSHA1";
    static final String HMACSHA256 = "HmacSHA256";
    static final String HMACSHA512 = "HmacSHA512";

    static final String PERIOD_30_STR = "30s";
    static final String PERIOD_60_STR = "60s";
    static final int PERIOD_30 = 30;
    static final int PERIOD_60 = 60;

    static final String DIGITS_6_STR = "6";
    static final String DIGITS_8_STR = "8";
    static final int DIGITS_6 = 6;
    static final int DIGITS_8 = 8;

    // ----- Stuff for push -----
    // Attribute names
    static final String PUSH = "pipush";
    static final String ROLLOUT_URL = "url";
    static final String TTL = "ttl";
    static final String PROJECT_ID = "projectid";
    static final String APP_ID = "appid";
    static final String API_KEY = "apikey";
    static final String PROJECT_NUMBER = "projectnumber";
    static final String FB_TOKEN = "fb_token";
    static final String ENROLLMENT_CRED = "enrollment_credential";

    // TODO
    static final String AUTHENTICATION_ENDPOINT_URL = "url";

    static final String NONCE = "nonce";
    static final String SIGNATURE = "signature";
    static final String SERIAL = "serial";
    static final String NOTIFICATION_TEXT = "question";
    static final String ROLLOUT_FINISHED = "rollout_finished";
    static final String ROLLOUT_EXPIRATION = "rollout_expiration";
    static final String DATA = "data";
    // Constants
    static final int READ_TIMEOUT = 10000;
    static final int CONNECT_TIMEOUT = 15000;

    static final String PUBKEYFILE = "pubkey.key";
    static final String NOTIFICATION_CHANNEL_ID = "privacyIDEAPush";

    // Status codes
    static final int PRO_STATUS_STEP_1 = 1001;
    static final int PRO_STATUS_STEP_2 = 1002;
    static final int PRO_STATUS_STEP_3 = 1003;
    static final int PRO_STATUS_DONE = 1004;
    static final int PRO_STATUS_REGISTRATION_TIME_EXPIRED = 1010;
    static final int PRO_STATUS_RESPONSE_NO_KEY = 1011;
    static final int PRO_STATUS_MALFORMED_URL = 1012;
    static final int PRO_STATUS_BAD_BASE64 = 1013;
    static final int PRO_STATUS_UNKNOWN_HOST = 1014;

    static final int PA_INVALID_SIGNATURE = 2001;
    static final int PA_SIGNING_FAILURE = 2002;

    static final int STATUS_DO_FIREBASE_INIT = 3001;
    static final int STATUS_DO_PUSH_ROLLOUT = 3002;
    static final int STATUS_DO_2STEP_ROLLOUT = 3003;


}
