package com.google.android.gms.games.internal;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
final class zzba extends com.google.android.gms.games.internal.zzao implements com.google.android.gms.games.event.Events.LoadEventsResult {
    private final com.google.android.gms.games.event.EventBuffer zza;

    zzba(com.google.android.gms.common.data.DataHolder r2) {
            r1 = this;
            r1.<init>(r2)
            com.google.android.gms.games.event.EventBuffer r0 = new com.google.android.gms.games.event.EventBuffer
            r0.<init>(r2)
            r1.zza = r0
            return
    }

    @Override // com.google.android.gms.games.event.Events.LoadEventsResult
    public final com.google.android.gms.games.event.EventBuffer getEvents() {
            r1 = this;
            com.google.android.gms.games.event.EventBuffer r0 = r1.zza
            return r0
    }
}
