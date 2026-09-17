package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzadk implements com.google.android.gms.internal.ads.zzaea {
    private final com.google.android.gms.internal.ads.zzadm zza;
    private final long zzb;

    public zzadk(com.google.android.gms.internal.ads.zzadm r1, long r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    private final com.google.android.gms.internal.ads.zzaeb zzb(long r4, long r6) {
            r3 = this;
            com.google.android.gms.internal.ads.zzadm r0 = r3.zza
            int r0 = r0.zze
            r1 = 1000000(0xf4240, double:4.940656E-318)
            long r4 = r4 * r1
            long r0 = (long) r0
            long r4 = r4 / r0
            com.google.android.gms.internal.ads.zzaeb r0 = new com.google.android.gms.internal.ads.zzaeb
            long r1 = r3.zzb
            long r1 = r1 + r6
            r0.<init>(r4, r1)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzaea
    public final long zza() {
            r2 = this;
            com.google.android.gms.internal.ads.zzadm r0 = r2.zza
            long r0 = r0.zza()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzaea
    public final com.google.android.gms.internal.ads.zzady zzg(long r10) {
            r9 = this;
            com.google.android.gms.internal.ads.zzadm r0 = r9.zza
            com.google.android.gms.internal.ads.zzadl r0 = r0.zzk
            com.google.android.gms.internal.ads.zzdi.zzb(r0)
            com.google.android.gms.internal.ads.zzadm r0 = r9.zza
            com.google.android.gms.internal.ads.zzadl r1 = r0.zzk
            long[] r2 = r1.zza
            long[] r1 = r1.zzb
            long r3 = r0.zzb(r10)
            r0 = 1
            r5 = 0
            int r3 = com.google.android.gms.internal.ads.zzeu.zzc(r2, r3, r0, r5)
            r4 = 0
            r6 = -1
            if (r3 != r6) goto L20
            r7 = r4
            goto L22
        L20:
            r7 = r2[r3]
        L22:
            if (r3 != r6) goto L25
            goto L27
        L25:
            r4 = r1[r3]
        L27:
            com.google.android.gms.internal.ads.zzaeb r4 = r9.zzb(r7, r4)
            long r7 = r4.zzb
            int r5 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r5 == 0) goto L45
            int r10 = r2.length
            int r10 = r10 + r6
            if (r3 != r10) goto L36
            goto L45
        L36:
            int r3 = r3 + r0
            r10 = r2[r3]
            r0 = r1[r3]
            com.google.android.gms.internal.ads.zzaeb r10 = r9.zzb(r10, r0)
            com.google.android.gms.internal.ads.zzady r11 = new com.google.android.gms.internal.ads.zzady
            r11.<init>(r4, r10)
            return r11
        L45:
            com.google.android.gms.internal.ads.zzady r10 = new com.google.android.gms.internal.ads.zzady
            r10.<init>(r4, r4)
            return r10
    }

    @Override // com.google.android.gms.internal.ads.zzaea
    public final boolean zzh() {
            r1 = this;
            r0 = 1
            return r0
    }
}
