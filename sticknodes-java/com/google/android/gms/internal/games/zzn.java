package com.google.android.gms.internal.games;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
public final class zzn extends com.google.android.gms.internal.games.zzad implements com.google.android.gms.games.AchievementsClient {
    public static final /* synthetic */ int zza = 0;

    public zzn(android.app.Activity r1, com.google.android.gms.games.Games.GamesOptions r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public zzn(android.content.Context r1, com.google.android.gms.games.Games.GamesOptions r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // com.google.android.gms.games.AchievementsClient
    public final com.google.android.gms.tasks.Task<android.content.Intent> getAchievementsIntent() {
            r2 = this;
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = com.google.android.gms.common.api.internal.TaskApiCall.builder()
            com.google.android.gms.internal.games.zzk r1 = com.google.android.gms.internal.games.zzk.zza
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = r0.run(r1)
            r1 = 6601(0x19c9, float:9.25E-42)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = r0.setMethodKey(r1)
            com.google.android.gms.common.api.internal.TaskApiCall r0 = r0.build()
            com.google.android.gms.tasks.Task r0 = r2.doRead(r0)
            return r0
    }

    @Override // com.google.android.gms.games.AchievementsClient
    public final void increment(java.lang.String r3, int r4) {
            r2 = this;
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = com.google.android.gms.common.api.internal.TaskApiCall.builder()
            com.google.android.gms.internal.games.zzl r1 = new com.google.android.gms.internal.games.zzl
            r1.<init>(r3, r4)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r3 = r0.run(r1)
            r4 = 6607(0x19cf, float:9.258E-42)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r3 = r3.setMethodKey(r4)
            com.google.android.gms.common.api.internal.TaskApiCall r3 = r3.build()
            r2.doWrite(r3)
            return
    }

    @Override // com.google.android.gms.games.AchievementsClient
    public final com.google.android.gms.tasks.Task<java.lang.Boolean> incrementImmediate(java.lang.String r3, int r4) {
            r2 = this;
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = com.google.android.gms.common.api.internal.TaskApiCall.builder()
            com.google.android.gms.internal.games.zzi r1 = new com.google.android.gms.internal.games.zzi
            r1.<init>(r3, r4)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r3 = r0.run(r1)
            r4 = 6608(0x19d0, float:9.26E-42)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r3 = r3.setMethodKey(r4)
            com.google.android.gms.common.api.internal.TaskApiCall r3 = r3.build()
            com.google.android.gms.tasks.Task r3 = r2.doWrite(r3)
            return r3
    }

    @Override // com.google.android.gms.games.AchievementsClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.games.AnnotatedData<com.google.android.gms.games.achievement.AchievementBuffer>> load(boolean r3) {
            r2 = this;
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = com.google.android.gms.common.api.internal.TaskApiCall.builder()
            com.google.android.gms.internal.games.zzj r1 = new com.google.android.gms.internal.games.zzj
            r1.<init>(r3)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r3 = r0.run(r1)
            r0 = 6602(0x19ca, float:9.251E-42)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r3 = r3.setMethodKey(r0)
            com.google.android.gms.common.api.internal.TaskApiCall r3 = r3.build()
            com.google.android.gms.tasks.Task r3 = r2.doRead(r3)
            return r3
    }

    @Override // com.google.android.gms.games.AchievementsClient
    public final void reveal(java.lang.String r3) {
            r2 = this;
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = com.google.android.gms.common.api.internal.TaskApiCall.builder()
            com.google.android.gms.internal.games.zze r1 = new com.google.android.gms.internal.games.zze
            r1.<init>(r3)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r3 = r0.run(r1)
            r0 = 6603(0x19cb, float:9.253E-42)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r3 = r3.setMethodKey(r0)
            com.google.android.gms.common.api.internal.TaskApiCall r3 = r3.build()
            r2.doWrite(r3)
            return
    }

    @Override // com.google.android.gms.games.AchievementsClient
    public final com.google.android.gms.tasks.Task<java.lang.Void> revealImmediate(java.lang.String r3) {
            r2 = this;
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = com.google.android.gms.common.api.internal.TaskApiCall.builder()
            com.google.android.gms.internal.games.zzm r1 = new com.google.android.gms.internal.games.zzm
            r1.<init>(r3)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r3 = r0.run(r1)
            r0 = 6604(0x19cc, float:9.254E-42)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r3 = r3.setMethodKey(r0)
            com.google.android.gms.common.api.internal.TaskApiCall r3 = r3.build()
            com.google.android.gms.tasks.Task r3 = r2.doWrite(r3)
            return r3
    }

    @Override // com.google.android.gms.games.AchievementsClient
    public final void setSteps(java.lang.String r3, int r4) {
            r2 = this;
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = com.google.android.gms.common.api.internal.TaskApiCall.builder()
            com.google.android.gms.internal.games.zzg r1 = new com.google.android.gms.internal.games.zzg
            r1.<init>(r3, r4)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r3 = r0.run(r1)
            r4 = 6609(0x19d1, float:9.261E-42)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r3 = r3.setMethodKey(r4)
            com.google.android.gms.common.api.internal.TaskApiCall r3 = r3.build()
            r2.doWrite(r3)
            return
    }

    @Override // com.google.android.gms.games.AchievementsClient
    public final com.google.android.gms.tasks.Task<java.lang.Boolean> setStepsImmediate(java.lang.String r3, int r4) {
            r2 = this;
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = com.google.android.gms.common.api.internal.TaskApiCall.builder()
            com.google.android.gms.internal.games.zzd r1 = new com.google.android.gms.internal.games.zzd
            r1.<init>(r3, r4)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r3 = r0.run(r1)
            r4 = 6610(0x19d2, float:9.263E-42)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r3 = r3.setMethodKey(r4)
            com.google.android.gms.common.api.internal.TaskApiCall r3 = r3.build()
            com.google.android.gms.tasks.Task r3 = r2.doWrite(r3)
            return r3
    }

    @Override // com.google.android.gms.games.AchievementsClient
    public final void unlock(java.lang.String r3) {
            r2 = this;
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = com.google.android.gms.common.api.internal.TaskApiCall.builder()
            com.google.android.gms.internal.games.zzf r1 = new com.google.android.gms.internal.games.zzf
            r1.<init>(r3)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r3 = r0.run(r1)
            r0 = 6605(0x19cd, float:9.256E-42)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r3 = r3.setMethodKey(r0)
            com.google.android.gms.common.api.internal.TaskApiCall r3 = r3.build()
            r2.doWrite(r3)
            return
    }

    @Override // com.google.android.gms.games.AchievementsClient
    public final com.google.android.gms.tasks.Task<java.lang.Void> unlockImmediate(java.lang.String r3) {
            r2 = this;
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = com.google.android.gms.common.api.internal.TaskApiCall.builder()
            com.google.android.gms.internal.games.zzh r1 = new com.google.android.gms.internal.games.zzh
            r1.<init>(r3)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r3 = r0.run(r1)
            r0 = 6606(0x19ce, float:9.257E-42)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r3 = r3.setMethodKey(r0)
            com.google.android.gms.common.api.internal.TaskApiCall r3 = r3.build()
            com.google.android.gms.tasks.Task r3 = r2.doWrite(r3)
            return r3
    }
}
