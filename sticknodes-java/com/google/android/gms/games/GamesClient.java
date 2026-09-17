package com.google.android.gms.games;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
public interface GamesClient {
    com.google.android.gms.tasks.Task<android.os.Bundle> getActivationHint();

    com.google.android.gms.tasks.Task<java.lang.String> getAppId();

    com.google.android.gms.tasks.Task<java.lang.String> getCurrentAccountName();

    com.google.android.gms.tasks.Task<android.content.Intent> getSettingsIntent();

    com.google.android.gms.tasks.Task<java.lang.Void> setGravityForPopups(int r1);

    com.google.android.gms.tasks.Task<java.lang.Void> setViewForPopups(android.view.View r1);
}
