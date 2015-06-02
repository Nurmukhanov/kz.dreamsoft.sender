package kz.dreamsoft.sender.utils;

import java.math.BigInteger;
import java.security.SecureRandom;

/**
 * Created by olzhas on 5/23/15.
 */
public class TokenUtils {
    private static SecureRandom random = new SecureRandom();

    public static String generateActiovationUrl(){
        return new BigInteger(130, random).toString(32);
    }
}
