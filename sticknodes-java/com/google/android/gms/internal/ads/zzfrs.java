package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzfrs {
    private final android.content.Context zza;
    private final java.util.concurrent.Executor zzb;
    private final com.google.android.gms.internal.ads.zzfqz zzc;
    private final com.google.android.gms.internal.ads.zzfrb zzd;
    private final com.google.android.gms.internal.ads.zzfrr zze;
    private final com.google.android.gms.internal.ads.zzfrr zzf;
    private com.google.android.gms.tasks.Task zzg;
    private com.google.android.gms.tasks.Task zzh;

    zzfrs(android.content.Context r1, java.util.concurrent.Executor r2, com.google.android.gms.internal.ads.zzfqz r3, com.google.android.gms.internal.ads.zzfrb r4, com.google.android.gms.internal.ads.zzfrp r5, com.google.android.gms.internal.ads.zzfrq r6) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            r0.zze = r5
            r0.zzf = r6
            return
    }

    public static com.google.android.gms.internal.ads.zzfrs zze(android.content.Context r8, java.util.concurrent.Executor r9, com.google.android.gms.internal.ads.zzfqz r10, com.google.android.gms.internal.ads.zzfrb r11) {
            com.google.android.gms.internal.ads.zzfrs r7 = new com.google.android.gms.internal.ads.zzfrs
            com.google.android.gms.internal.ads.zzfrp r5 = new com.google.android.gms.internal.ads.zzfrp
            r5.<init>()
            com.google.android.gms.internal.ads.zzfrq r6 = new com.google.android.gms.internal.ads.zzfrq
            r6.<init>()
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6)
            com.google.android.gms.internal.ads.zzfrb r8 = r7.zzd
            boolean r8 = r8.zzd()
            if (r8 == 0) goto L28
            com.google.android.gms.internal.ads.zzfrm r8 = new com.google.android.gms.internal.ads.zzfrm
            r8.<init>(r7)
            com.google.android.gms.tasks.Task r8 = r7.zzh(r8)
            r7.zzg = r8
            goto L34
        L28:
            com.google.android.gms.internal.ads.zzfrr r8 = r7.zze
            com.google.android.gms.internal.ads.zzath r8 = r8.zza()
            com.google.android.gms.tasks.Task r8 = com.google.android.gms.tasks.Tasks.forResult(r8)
            r7.zzg = r8
        L34:
            com.google.android.gms.internal.ads.zzfrn r8 = new com.google.android.gms.internal.ads.zzfrn
            r8.<init>(r7)
            com.google.android.gms.tasks.Task r8 = r7.zzh(r8)
            r7.zzh = r8
            return r7
    }

    private static com.google.android.gms.internal.ads.zzath zzg(com.google.android.gms.tasks.Task r1, com.google.android.gms.internal.ads.zzath r2) {
            boolean r0 = r1.isSuccessful()
            if (r0 != 0) goto L7
            return r2
        L7:
            java.lang.Object r1 = r1.getResult()
            com.google.android.gms.internal.ads.zzath r1 = (com.google.android.gms.internal.ads.zzath) r1
            return r1
    }

    private final com.google.android.gms.tasks.Task zzh(java.util.concurrent.Callable r3) {
            r2 = this;
            java.util.concurrent.Executor r0 = r2.zzb
            com.google.android.gms.tasks.Task r3 = com.google.android.gms.tasks.Tasks.call(r0, r3)
            com.google.android.gms.internal.ads.zzfro r0 = new com.google.android.gms.internal.ads.zzfro
            r0.<init>(r2)
            java.util.concurrent.Executor r1 = r2.zzb
            com.google.android.gms.tasks.Task r3 = r3.addOnFailureListener(r1, r0)
            return r3
    }

    public final com.google.android.gms.internal.ads.zzath zza() {
            r2 = this;
            com.google.android.gms.internal.ads.zzfrr r0 = r2.zze
            com.google.android.gms.tasks.Task r1 = r2.zzg
            com.google.android.gms.internal.ads.zzath r0 = r0.zza()
            com.google.android.gms.internal.ads.zzath r0 = zzg(r1, r0)
            return r0
    }

    public final com.google.android.gms.internal.ads.zzath zzb() {
            r2 = this;
            com.google.android.gms.internal.ads.zzfrr r0 = r2.zzf
            com.google.android.gms.tasks.Task r1 = r2.zzh
            com.google.android.gms.internal.ads.zzath r0 = r0.zza()
            com.google.android.gms.internal.ads.zzath r0 = zzg(r1, r0)
            return r0
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzath zzc() throws java.lang.Exception {
            r7 = this;
            com.google.android.gms.internal.ads.zzasm r0 = com.google.android.gms.internal.ads.zzath.zza()
            android.content.Context r1 = r7.zza
            com.google.android.gms.ads.identifier.AdvertisingIdClient$Info r1 = com.google.android.gms.ads.identifier.AdvertisingIdClient.getAdvertisingIdInfo(r1)
            java.lang.String r2 = r1.getId()
            if (r2 == 0) goto L38
            java.lang.String r3 = "^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$"
            boolean r3 = r2.matches(r3)
            if (r3 == 0) goto L38
            java.util.UUID r2 = java.util.UUID.fromString(r2)
            r3 = 16
            byte[] r3 = new byte[r3]
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.wrap(r3)
            long r5 = r2.getMostSignificantBits()
            r4.putLong(r5)
            long r5 = r2.getLeastSignificantBits()
            r4.putLong(r5)
            r2 = 11
            java.lang.String r2 = android.util.Base64.encodeToString(r3, r2)
        L38:
            if (r2 == 0) goto L48
            r0.zzs(r2)
            boolean r1 = r1.isLimitAdTrackingEnabled()
            r0.zzr(r1)
            r1 = 6
            r0.zzab(r1)
        L48:
            com.google.android.gms.internal.ads.zzhbe r0 = r0.zzbn()
            com.google.android.gms.internal.ads.zzath r0 = (com.google.android.gms.internal.ads.zzath) r0
            return r0
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzath zzd() throws java.lang.Exception {
            r4 = this;
            android.content.Context r0 = r4.zza
            android.content.pm.PackageManager r1 = r0.getPackageManager()
            java.lang.String r2 = r0.getPackageName()
            r3 = 0
            android.content.pm.PackageInfo r1 = r1.getPackageInfo(r2, r3)
            java.lang.String r2 = r0.getPackageName()
            int r1 = r1.versionCode
            java.lang.String r1 = java.lang.Integer.toString(r1)
            com.google.android.gms.internal.ads.zzath r0 = com.google.android.gms.internal.ads.zzfrh.zza(r0, r2, r1)
            return r0
    }

    final /* synthetic */ void zzf(java.lang.Exception r5) {
            r4 = this;
            boolean r0 = r5 instanceof java.lang.InterruptedException
            if (r0 == 0) goto Lb
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        Lb:
            com.google.android.gms.internal.ads.zzfqz r0 = r4.zzc
            r1 = 2025(0x7e9, float:2.838E-42)
            r2 = -1
            r0.zzc(r1, r2, r5)
            return
    }
}
