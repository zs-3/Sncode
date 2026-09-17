package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzakc {
    private final com.google.android.gms.internal.ads.zzakd zza;
    private final com.google.android.gms.internal.ads.zzek zzb;
    private int zzc;
    private int zzd;
    private boolean zze;

    zzakc() {
            r3 = this;
            r3.<init>()
            com.google.android.gms.internal.ads.zzakd r0 = new com.google.android.gms.internal.ads.zzakd
            r0.<init>()
            r3.zza = r0
            com.google.android.gms.internal.ads.zzek r0 = new com.google.android.gms.internal.ads.zzek
            r1 = 65025(0xfe01, float:9.112E-41)
            byte[] r1 = new byte[r1]
            r2 = 0
            r0.<init>(r1, r2)
            r3.zzb = r0
            r0 = -1
            r3.zzc = r0
            return
    }

    private final int zzf(int r6) {
            r5 = this;
            r0 = 0
            r5.zzd = r0
        L3:
            int r1 = r5.zzd
            int r2 = r6 + r1
            com.google.android.gms.internal.ads.zzakd r3 = r5.zza
            int r4 = r3.zzc
            if (r2 >= r4) goto L1a
            int r1 = r1 + 1
            r5.zzd = r1
            int[] r1 = r3.zzf
            r1 = r1[r2]
            int r0 = r0 + r1
            r2 = 255(0xff, float:3.57E-43)
            if (r1 == r2) goto L3
        L1a:
            return r0
    }

    public final com.google.android.gms.internal.ads.zzek zza() {
            r1 = this;
            com.google.android.gms.internal.ads.zzek r0 = r1.zzb
            return r0
    }

    public final com.google.android.gms.internal.ads.zzakd zzb() {
            r1 = this;
            com.google.android.gms.internal.ads.zzakd r0 = r1.zza
            return r0
    }

    public final void zzc() {
            r2 = this;
            com.google.android.gms.internal.ads.zzakd r0 = r2.zza
            r0.zza()
            com.google.android.gms.internal.ads.zzek r0 = r2.zzb
            r1 = 0
            r0.zzI(r1)
            r0 = -1
            r2.zzc = r0
            r2.zze = r1
            return
    }

    public final void zzd() {
            r4 = this;
            com.google.android.gms.internal.ads.zzek r0 = r4.zzb
            byte[] r1 = r0.zzN()
            int r1 = r1.length
            r2 = 65025(0xfe01, float:9.112E-41)
            if (r1 != r2) goto Ld
            return
        Ld:
            byte[] r1 = r0.zzN()
            int r3 = r0.zze()
            int r2 = java.lang.Math.max(r2, r3)
            byte[] r1 = java.util.Arrays.copyOf(r1, r2)
            com.google.android.gms.internal.ads.zzek r2 = r4.zzb
            int r2 = r2.zze()
            r0.zzJ(r1, r2)
            return
    }

    public final boolean zze(com.google.android.gms.internal.ads.zzadc r7) throws java.io.IOException {
            r6 = this;
            boolean r0 = r6.zze
            r1 = 0
            if (r0 != 0) goto L6
            goto Ld
        L6:
            r6.zze = r1
            com.google.android.gms.internal.ads.zzek r0 = r6.zzb
            r0.zzI(r1)
        Ld:
            boolean r0 = r6.zze
            r2 = 1
            if (r0 != 0) goto L99
            int r0 = r6.zzc
            if (r0 >= 0) goto L4e
            com.google.android.gms.internal.ads.zzakd r0 = r6.zza
            r3 = -1
            boolean r0 = r0.zzc(r7, r3)
            if (r0 == 0) goto L4d
            com.google.android.gms.internal.ads.zzakd r0 = r6.zza
            boolean r0 = r0.zzb(r7, r2)
            if (r0 != 0) goto L29
            goto L4d
        L29:
            com.google.android.gms.internal.ads.zzakd r0 = r6.zza
            int r3 = r0.zzd
            int r0 = r0.zza
            r0 = r0 & r2
            if (r0 != r2) goto L42
            com.google.android.gms.internal.ads.zzek r0 = r6.zzb
            int r0 = r0.zze()
            if (r0 != 0) goto L42
            int r0 = r6.zzf(r1)
            int r3 = r3 + r0
            int r0 = r6.zzd
            goto L43
        L42:
            r0 = 0
        L43:
            boolean r3 = com.google.android.gms.internal.ads.zzadf.zze(r7, r3)
            if (r3 != 0) goto L4a
            return r1
        L4a:
            r6.zzc = r0
            goto L4e
        L4d:
            return r1
        L4e:
            int r0 = r6.zzf(r0)
            int r3 = r6.zzc
            int r4 = r6.zzd
            int r3 = r3 + r4
            if (r0 <= 0) goto L8e
            com.google.android.gms.internal.ads.zzek r4 = r6.zzb
            int r5 = r4.zze()
            int r5 = r5 + r0
            r4.zzF(r5)
            com.google.android.gms.internal.ads.zzek r4 = r6.zzb
            byte[] r5 = r4.zzN()
            int r4 = r4.zze()
            boolean r4 = com.google.android.gms.internal.ads.zzadf.zzd(r7, r5, r4, r0)
            if (r4 != 0) goto L74
            return r1
        L74:
            com.google.android.gms.internal.ads.zzek r4 = r6.zzb
            int r5 = r4.zze()
            int r5 = r5 + r0
            r4.zzK(r5)
            com.google.android.gms.internal.ads.zzakd r0 = r6.zza
            int r4 = r3 + (-1)
            int[] r0 = r0.zzf
            r0 = r0[r4]
            r4 = 255(0xff, float:3.57E-43)
            if (r0 == r4) goto L8b
            goto L8c
        L8b:
            r2 = 0
        L8c:
            r6.zze = r2
        L8e:
            com.google.android.gms.internal.ads.zzakd r0 = r6.zza
            int r0 = r0.zzc
            if (r3 != r0) goto L95
            r3 = -1
        L95:
            r6.zzc = r3
            goto Ld
        L99:
            return r2
    }
}
