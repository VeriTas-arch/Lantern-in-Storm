package top.bearcabbage.lanterninstorm;

import eu.pb4.playerdata.api.PlayerDataApi;
import eu.pb4.playerdata.api.storage.NbtDataStorage;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import top.bearcabbage.lanterninstorm.entity.SpiritLanternEntity;
import top.bearcabbage.lanterninstorm.entity.SpiritLanternEntityRenderer;

public class LanternInStorm implements ModInitializer {
	public static final String MOD_ID = "lantern-in-storm";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static final NbtDataStorage LSData = new NbtDataStorage("LS_Data");



	@Override
	public void onInitialize() {

		// 获取配置文件
		PlayerDataApi.register(LSData);
		// 使用CommandRegistrationCallback.EVENT注册命令
		CommandRegistrationCallback.EVENT.register((dispatcher, registryAccess, environment)->LanternInStormCommands.registerCommands(dispatcher)); // 调用静态方法注册命令


	}
}