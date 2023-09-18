package com.ryderbelserion.simplechat.api.listeners;

import com.ryderbelserion.cluster.api.utils.ColorUtils;
import net.kyori.adventure.audience.Audience;
import net.kyori.adventure.text.Component;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class ChatRenderer implements io.papermc.paper.chat.ChatRenderer {

    @Override
    public @NotNull Component render(@NotNull Player source, @NotNull Component sourceDisplayName, @NotNull Component message, @NotNull Audience viewer) {
        return ColorUtils.parse(source.getName() + " : ").append(message);
    }
}