package main.java.com.smart.wallet.userprofile.userController;


@RestController
@RequestMapping("/user")
public interface userController {
public ResponseEntity<userModel> getUserProfile(@RequestParam String userId);

}
