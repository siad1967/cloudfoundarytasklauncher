package com.example;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.cloud.task.launcher.annotation.EnableTaskLauncher;

/**
 * Created by sanandan on 8/31/16.
 */
@EnableBinding(Sink.class)
@EnableTaskLauncher
public class CloudFoundryTaskLauncherConfiguration {
}
