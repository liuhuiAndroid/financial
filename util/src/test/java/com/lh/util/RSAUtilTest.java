package com.lh.util;

import org.junit.Test;

/**
 * 测试加签验签
 */
public class RSAUtilTest {

    static final String publicKey = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCiqvcJQROuAmoiNQEkY0rlhaBQ\n" +
            "JqcZqdbkvhsHp5irrwvoesFKvoXELLVaS0tPyL8u5I5wfzYgr9OCjKWNZgst5Ctn\n" +
            "1V7JJp+m9xUUA+TyO2SU5Rpr5NRvYH3OZeIgBXMERGbzNZkeoLBWAq7lgQDgf9jG\n" +
            "joGFbS2VpmzuoN5yPwIDAQAB";
    static final String privateKey = "MIICdQIBADANBgkqhkiG9w0BAQEFAASCAl8wggJbAgEAAoGBAKKq9wlBE64CaiI1\n" +
            "ASRjSuWFoFAmpxmp1uS+GwenmKuvC+h6wUq+hcQstVpLS0/Ivy7kjnB/NiCv04KM\n" +
            "pY1mCy3kK2fVXskmn6b3FRQD5PI7ZJTlGmvk1G9gfc5l4iAFcwREZvM1mR6gsFYC\n" +
            "ruWBAOB/2MaOgYVtLZWmbO6g3nI/AgMBAAECgYBcteQmOhjlTCsBZARKoOzG8+ny\n" +
            "xJToY4w+wrrVGghBkXrP/Wa9GulSbcjOtasuxdNw/oLQSzCmYI/EEDUq6cXkcU8d\n" +
            "o4YtrX5kGeJZ9xDgrpB5unQSREENH5RmKhdm8ioixqO2VfSgkfUieIyUT4ilJy7A\n" +
            "/ZhT2zuIaaUo+dALQQJBAM4LdvpoWJ4UUqN4N9dmvSXWGaFwWLRmdmRNkpjKw5cy\n" +
            "D1c9HFDiGlyE8m4FZ+roL6Zmydyn33Zhn6nrGLjdiRMCQQDKGzuR9Ueo+b7b4A4P\n" +
            "I71zFpEfDZ0HZOqPgWWlhVemVk51QtzNuI/fWnUWV0R6+gJF0R2QEOgef2TDAeZc\n" +
            "uqOlAkBiZWU3JheTvj7Mo/9+1Shk5j6tMtqZpAjL06O7ZbFMBfL/hUZ9dcyC/FZN\n" +
            "pjU/IAyJWbLythRoEyzNV2Eh/2GTAkALemR1s6JwPE7UmfLydSsrQBrZ0qIaa2bO\n" +
            "46BsOBh0P+6Qxk1X+aViH/cKX8Zp3Y0HfgrZxbwJD18fnBoDJi5pAkAhRjey2F/T\n" +
            "aZrJrgGohnxLwXFpqcS68qAA8I6oEDo0kIXlvpoZ+HV4DQq3UIut87J17bNrDtlt\n" +
            "MUmSjtzBDo8x";
    @Test
    public void signTest(){
        String text = "{\"amount\":10,\"chanId\":\"string\",\"chanUserId\":\"string\",\"createAt\":\"2018-07-20 02:34:44\",\"memo\":\"string\",\"outerOrderId\":\"string\",\"productId\":\"T001\"}";
        String sign = RSAUtil.sign(text,privateKey);
        System.out.println(sign);
        System.out.println(RSAUtil.verify(text, sign, publicKey));
    }

}
