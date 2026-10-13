


@RestController
@RequestMapping("/user")
public class userController {
public ResponseEntity<userModel> getUserProfile(@RequestParam String userId) 
{
    // Implement the logic to retrieve user profile based on userId
    // For example, you can call a service method to fetch the user profile from the database
    userModel userProfile = userService.getUserProfile(userId);
    return ResponseEntity.ok(userProfile);
}

}
