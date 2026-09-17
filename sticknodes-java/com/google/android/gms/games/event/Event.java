package com.google.android.gms.games.event;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
@com.google.android.gms.common.util.VisibleForTesting
/* loaded from: classes.dex */
public interface Event extends com.google.android.gms.common.data.Freezable<com.google.android.gms.games.event.Event>, android.os.Parcelable {
    java.lang.String getDescription();

    void getDescription(android.database.CharArrayBuffer r1);

    java.lang.String getEventId();

    java.lang.String getFormattedValue();

    void getFormattedValue(android.database.CharArrayBuffer r1);

    android.net.Uri getIconImageUri();

    @com.google.android.gms.common.annotation.KeepName
    @java.lang.Deprecated
    java.lang.String getIconImageUrl();

    java.lang.String getName();

    void getName(android.database.CharArrayBuffer r1);

    com.google.android.gms.games.Player getPlayer();

    long getValue();

    boolean isVisible();
}
