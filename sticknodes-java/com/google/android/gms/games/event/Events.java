package com.google.android.gms.games.event;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
@com.google.android.gms.common.util.VisibleForTesting
@com.google.android.gms.internal.games.zzfp
@java.lang.Deprecated
/* loaded from: classes.dex */
public interface Events {

    /* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
    @com.google.android.gms.internal.games.zzfp
    @java.lang.Deprecated
    public interface LoadEventsResult extends com.google.android.gms.common.api.Result, com.google.android.gms.common.api.Releasable {
        @com.google.android.gms.internal.games.zzfp
        com.google.android.gms.games.event.EventBuffer getEvents();
    }

    @com.google.android.gms.internal.games.zzfp
    void increment(com.google.android.gms.common.api.GoogleApiClient r1, java.lang.String r2, int r3);

    @com.google.android.gms.internal.games.zzfp
    com.google.android.gms.common.api.PendingResult<com.google.android.gms.games.event.Events.LoadEventsResult> load(com.google.android.gms.common.api.GoogleApiClient r1, boolean r2);

    @com.google.android.gms.internal.games.zzfp
    com.google.android.gms.common.api.PendingResult<com.google.android.gms.games.event.Events.LoadEventsResult> loadByIds(com.google.android.gms.common.api.GoogleApiClient r1, boolean r2, java.lang.String... r3);
}
