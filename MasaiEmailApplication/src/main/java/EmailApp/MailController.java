package EmailApp;

@RestController
public class MailController {

	@Autowired
	private MailService notificationService;

	@Autowired
	private User user;

	@RequestMapping("send-mail")
	public String send() {
		user.setEmailAddress("receiver's email address");  
		try {
			notificationService.sendEmail(user);
		} catch (MailException mailException) {
			System.out.println(mailException);
		}
		return "Your mail has been send to the user.";
	}
	@RequestMapping("send-mail-attachment")
	public String sendWithAttachment() throws MessagingException {
		user.setEmailAddress("receiver's email address"); 
		try {
		notificationService.sendEmailWithAttachment(user);
		} catch (MailException mailException) {
			System.out.println(mailException);
		}
		return "Your mail has been send to the user.";
	}
}