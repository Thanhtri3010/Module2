package thanh_tri.service.exception;

import java.util.Scanner;

public class Regex {
    static Scanner scanner = new Scanner(System.in);
    public static final String REGEX_CODE_STUDENT = "^(SV-)\\d{4}$";
    public static final String REGEX_CODE_TEACHER = "^(GV-)\\d{4}$";
    public static final String REGEX_DATE_OF_BIRTH = "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";

    public static String getRegexCodeStudent() {
        String serviceCode = CheckException.checkString();
        while (!serviceCode.matches(REGEX_CODE_STUDENT)) {
            System.out.println("Nhập không đúng định dạng mã sinh viên !!" +
                    "\nYêu cầu nhập lại lại đây theo định dạng SV-XXXX: ");
            serviceCode = scanner.nextLine();
        }
        return serviceCode;
    }

    public static String getRegexCodeTeacher() {
        String serviceCode = CheckException.checkString();
        while (!serviceCode.matches(REGEX_CODE_TEACHER)) {
            System.out.println("Nhập không đúng định dạng mã giảng viên !!" +
                    "\nYêu cầu nhập lại lại đây theo định dạng GV-XXXX: ");
            serviceCode = scanner.nextLine();
        }
        return serviceCode;
    }

    public static String getRegexDateOfBirth() {
        String serviceCode = CheckException.checkString();
        while (!serviceCode.matches(REGEX_DATE_OF_BIRTH)) {
            System.out.println("Nhập không đúng định dạng ngày sinh !!" +
                    "\nYêu cầu nhập lại lại đây theo định dạng dd/MM/yyyy: ");
            serviceCode = scanner.nextLine();
        }
        return serviceCode;
    }
}
