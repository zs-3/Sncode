package com.google.android.gms.internal.games;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
public final class zzah extends com.google.android.gms.internal.games.zzad implements com.google.android.gms.games.EventsClient {
    public static final /* synthetic */ int zza = 0;

    public zzah(android.app.Activity r1, com.google.android.gms.games.Games.GamesOptions r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public zzah(android.content.Context r1, com.google.android.gms.games.Games.GamesOptions r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // com.google.android.gms.games.EventsClient
    public final void increment(java.lang.String r3, int r4) {
            r2 = this;
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = com.google.android.gms.common.api.internal.TaskApiCall.builder()
            com.google.android.gms.internal.games.zzae r1 = new com.google.android.gms.internal.games.zzae
            r1.<init>(r3, r4)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r3 = r0.run(r1)
            r4 = 6615(0x19d7, float:9.27E-42)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r3 = r3.setMethodKey(r4)
            com.google.android.gms.common.api.internal.TaskApiCall r3 = r3.build()
            r2.doWrite(r3)
            return
    }

    @Override // com.google.android.gms.games.EventsClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.games.AnnotatedData<com.google.android.gms.games.event.EventBuffer>> load(boolean r3) {
            r2 = this;
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = com.google.android.gms.common.api.internal.TaskApiCall.builder()
            com.google.android.gms.internal.games.zzaf r1 = new com.google.android.gms.internal.games.zzaf
            r1.<init>(r3)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r3 = r0.run(r1)
            r0 = 6613(0x19d5, float:9.267E-42)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r3 = r3.setMethodKey(r0)
            com.google.android.gms.common.api.internal.TaskApiCall r3 = r3.build()
            com.google.android.gms.tasks.Task r3 = r2.doRead(r3)
            return r3
    }

    @Override // com.google.android.gms.games.EventsClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.games.AnnotatedData<com.google.android.gms.games.event.EventBuffer>> loadByIds(boolean r3, java.lang.String... r4) {
            r2 = this;
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = com.google.android.gms.common.api.internal.TaskApiCall.builder()
            com.google.android.gms.internal.games.zzag r1 = new com.google.android.gms.internal.games.zzag
            r1.<init>(r3, r4)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r3 = r0.run(r1)
            r4 = 6614(0x19d6, float:9.268E-42)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r3 = r3.setMethodKey(r4)
            com.google.android.gms.common.api.internal.TaskApiCall r3 = r3.build()
            com.google.android.gms.tasks.Task r3 = r2.doRead(r3)
            return r3
    }
}
