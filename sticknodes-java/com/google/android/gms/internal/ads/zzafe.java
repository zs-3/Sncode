package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzafe implements com.google.android.gms.internal.ads.zzacl {
    private final com.google.android.gms.internal.ads.zzadm zza;
    private final int zzb;
    private final com.google.android.gms.internal.ads.zzadh zzc;

    /* synthetic */ zzafe(com.google.android.gms.internal.ads.zzadm r1, int r2, com.google.android.gms.internal.ads.zzafd r3) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            com.google.android.gms.internal.ads.zzadh r1 = new com.google.android.gms.internal.ads.zzadh
            r1.<init>()
            r0.zzc = r1
            return
    }

    private final long zzc(com.google.android.gms.internal.ads.zzadc r14) throws java.io.IOException {
            r13 = this;
        L0:
            long r0 = r14.zze()
            long r2 = r14.zzd()
            r4 = -6
            long r2 = r2 + r4
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 >= 0) goto L6d
            com.google.android.gms.internal.ads.zzadm r0 = r13.zza
            int r1 = r13.zzb
            com.google.android.gms.internal.ads.zzadh r2 = r13.zzc
            long r6 = r14.zze()
            r3 = 2
            byte[] r8 = new byte[r3]
            r9 = 0
            r14.zzh(r8, r9, r3)
            r10 = r8[r9]
            r10 = r10 & 255(0xff, float:3.57E-43)
            r11 = 1
            r12 = r8[r11]
            r12 = r12 & 255(0xff, float:3.57E-43)
            int r10 = r10 << 8
            r10 = r10 | r12
            if (r10 == r1) goto L3b
            r14.zzj()
            long r0 = r14.zzf()
            long r6 = r6 - r0
            int r0 = (int) r6
            r14.zzg(r0)
            goto L69
        L3b:
            com.google.android.gms.internal.ads.zzek r10 = new com.google.android.gms.internal.ads.zzek
            r12 = 16
            r10.<init>(r12)
            byte[] r12 = r10.zzN()
            java.lang.System.arraycopy(r8, r9, r12, r9, r3)
            byte[] r8 = r10.zzN()
            r9 = 14
            int r3 = com.google.android.gms.internal.ads.zzadf.zza(r14, r8, r3, r9)
            r10.zzK(r3)
            r14.zzj()
            long r8 = r14.zzf()
            long r6 = r6 - r8
            int r3 = (int) r6
            r14.zzg(r3)
            boolean r0 = com.google.android.gms.internal.ads.zzadi.zzc(r10, r0, r1, r2)
            if (r0 == 0) goto L69
            goto L6d
        L69:
            r14.zzg(r11)
            goto L0
        L6d:
            long r0 = r14.zze()
            long r2 = r14.zzd()
            long r2 = r2 + r4
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L8c
            long r0 = r14.zzd()
            long r2 = r14.zze()
            long r0 = r0 - r2
            int r1 = (int) r0
            r14.zzg(r1)
            com.google.android.gms.internal.ads.zzadm r14 = r13.zza
            long r0 = r14.zzj
            return r0
        L8c:
            com.google.android.gms.internal.ads.zzadh r14 = r13.zzc
            long r0 = r14.zza
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzacl
    public final com.google.android.gms.internal.ads.zzack zza(com.google.android.gms.internal.ads.zzadc r12, long r13) throws java.io.IOException {
            r11 = this;
            long r0 = r12.zzf()
            long r2 = r11.zzc(r12)
            long r4 = r12.zze()
            com.google.android.gms.internal.ads.zzadm r6 = r11.zza
            int r6 = r6.zzc
            r7 = 6
            int r6 = java.lang.Math.max(r7, r6)
            r12.zzg(r6)
            int r6 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            long r7 = r11.zzc(r12)
            long r9 = r12.zze()
            if (r6 > 0) goto L2e
            int r12 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r12 > 0) goto L29
            goto L2e
        L29:
            com.google.android.gms.internal.ads.zzack r12 = com.google.android.gms.internal.ads.zzack.zze(r4)
            return r12
        L2e:
            int r12 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r12 > 0) goto L37
            com.google.android.gms.internal.ads.zzack r12 = com.google.android.gms.internal.ads.zzack.zzf(r7, r9)
            return r12
        L37:
            com.google.android.gms.internal.ads.zzack r12 = com.google.android.gms.internal.ads.zzack.zzd(r2, r0)
            return r12
    }

    @Override // com.google.android.gms.internal.ads.zzacl
    public final /* synthetic */ void zzb() {
            r0 = this;
            return
    }
}
