package disconnect;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class command implements CommandExecutor {

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(label.equalsIgnoreCase("disconnect")) {
			if(sender instanceof Player) {
				Player p = (Player) sender;
				p.kickPlayer("You have Disconnected via Disconnect v1.0 by MattyJ1707!");
			}
		} else if(label.equalsIgnoreCase("dc")) {
			if(sender instanceof Player) {
				Player p = (Player) sender;
				p.kickPlayer("You have Disconnected via Disconnect v1.0 by MattyJ1707!");
			}
		}
		return false;
	}

}
