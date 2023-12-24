public class ExampleSwitch {
    public static void main(String[] args) {
        String extension = "pdf";

        switch (extension) {
            case "docx":
                System.out.println("this is word document");
                break;
            case "pdf":
                System.out.println("this is pdf document");
                break;
            case "txt":
                System.out.println("this is text document");
                break;
            default:
                System.out.println("we do not support this file");
        }

        int month = 3;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("this month has 31 days.");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("this month has 30 days.");
                break;
            case 2:
                System.out.println("this month has either 28 or 29 days.");
                break;
        }
    }
}
