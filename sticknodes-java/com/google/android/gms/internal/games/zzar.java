package com.google.android.gms.internal.games;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
public final class zzar implements com.google.android.gms.games.event.Events {
    public zzar() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.games.event.Events
    @android.annotation.SuppressLint({"MissingRemoteException"})
    public final void increment(com.google.android.gms.common.api.GoogleApiClient r3, java.lang.String r4, int r5) {
            r2 = this;
            r0 = 0
            com.google.android.gms.games.internal.zzbz r0 = com.google.android.gms.games.Games.zzc(r3, r0)
            if (r0 != 0) goto L8
            return
        L8:
            boolean r1 = r0.isConnected()
            if (r1 == 0) goto L12
            r0.zzab(r4, r5)
            return
        L12:
            com.google.android.gms.internal.games.zzak r0 = new com.google.android.gms.internal.games.zzak
            r0.<init>(r2, r3, r4, r5)
            r3.execute(r0)
            return
    }

    @Override // com.google.android.gms.games.event.Events
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.games.event.Events.LoadEventsResult> load(com.google.android.gms.common.api.GoogleApiClient r2, boolean r3) {
            r1 = this;
            com.google.android.gms.internal.games.zzaj r0 = new com.google.android.gms.internal.games.zzaj
            r0.<init>(r1, r2, r3)
            com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl r2 = r2.enqueue(r0)
            return r2
    }

    @Override // com.google.android.gms.games.event.Events
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.games.event.Events.LoadEventsResult> loadByIds(com.google.android.gms.common.api.GoogleApiClient r2, boolean r3, java.lang.String... r4) {
            r1 = this;
            com.google.android.gms.internal.games.zzai r0 = new com.google.android.gms.internal.games.zzai
            r0.<init>(r1, r2, r3, r4)
            com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl r2 = r2.enqueue(r0)
            return r2
    }
}
