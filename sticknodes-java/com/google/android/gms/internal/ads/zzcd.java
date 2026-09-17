package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzcd {
    public final int zza;
    public final java.lang.String zzb;
    public final int zzc;
    private final com.google.android.gms.internal.ads.zzaf[] zzd;
    private int zze;

    static {
            r0 = 0
            r1 = 36
            java.lang.Integer.toString(r0, r1)
            r0 = 1
            java.lang.Integer.toString(r0, r1)
            return
    }

    public zzcd(java.lang.String r5, com.google.android.gms.internal.ads.zzaf... r6) {
            r4 = this;
            r4.<init>()
            int r0 = r6.length
            r1 = 1
            r2 = 0
            if (r0 <= 0) goto La
            r3 = 1
            goto Lb
        La:
            r3 = 0
        Lb:
            com.google.android.gms.internal.ads.zzdi.zzd(r3)
            r4.zzb = r5
            r4.zzd = r6
            r4.zza = r0
            r5 = r6[r2]
            java.lang.String r5 = r5.zzn
            int r5 = com.google.android.gms.internal.ads.zzbn.zzb(r5)
            r0 = -1
            if (r5 != r0) goto L27
            r5 = r6[r2]
            java.lang.String r5 = r5.zzm
            int r5 = com.google.android.gms.internal.ads.zzbn.zzb(r5)
        L27:
            r4.zzc = r5
            r5 = r6[r2]
            java.lang.String r5 = r5.zzd
            java.lang.String r5 = zzc(r5)
            r6 = r6[r2]
            int r6 = r6.zzf
            r6 = r6 | 16384(0x4000, float:2.2959E-41)
        L37:
            com.google.android.gms.internal.ads.zzaf[] r0 = r4.zzd
            int r3 = r0.length
            if (r1 >= r3) goto L7f
            r0 = r0[r1]
            java.lang.String r0 = r0.zzd
            java.lang.String r0 = zzc(r0)
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L5a
            com.google.android.gms.internal.ads.zzaf[] r5 = r4.zzd
            r6 = r5[r2]
            java.lang.String r6 = r6.zzd
            r5 = r5[r1]
            java.lang.String r5 = r5.zzd
            java.lang.String r0 = "languages"
            zzd(r0, r6, r5, r1)
            return
        L5a:
            com.google.android.gms.internal.ads.zzaf[] r0 = r4.zzd
            r3 = r0[r1]
            int r3 = r3.zzf
            r3 = r3 | 16384(0x4000, float:2.2959E-41)
            if (r6 == r3) goto L7c
            r5 = r0[r2]
            int r5 = r5.zzf
            java.lang.String r5 = java.lang.Integer.toBinaryString(r5)
            com.google.android.gms.internal.ads.zzaf[] r6 = r4.zzd
            r6 = r6[r1]
            int r6 = r6.zzf
            java.lang.String r6 = java.lang.Integer.toBinaryString(r6)
            java.lang.String r0 = "role flags"
            zzd(r0, r5, r6, r1)
            return
        L7c:
            int r1 = r1 + 1
            goto L37
        L7f:
            return
    }

    private static java.lang.String zzc(java.lang.String r1) {
            if (r1 == 0) goto Lc
            java.lang.String r0 = "und"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Lb
            goto Lc
        Lb:
            return r1
        Lc:
            java.lang.String r1 = ""
            return r1
    }

    private static void zzd(java.lang.String r3, java.lang.String r4, java.lang.String r5, int r6) {
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Different "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = " combined in one TrackGroup: '"
            r1.append(r3)
            r1.append(r4)
            java.lang.String r3 = "' (track 0) and '"
            r1.append(r3)
            r1.append(r5)
            java.lang.String r3 = "' (track "
            r1.append(r3)
            r1.append(r6)
            java.lang.String r3 = ")"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            java.lang.String r3 = "TrackGroup"
            java.lang.String r4 = ""
            com.google.android.gms.internal.ads.zzea.zzd(r3, r4, r0)
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L27
            java.lang.Class<com.google.android.gms.internal.ads.zzcd> r2 = com.google.android.gms.internal.ads.zzcd.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L27
        L10:
            com.google.android.gms.internal.ads.zzcd r5 = (com.google.android.gms.internal.ads.zzcd) r5
            java.lang.String r2 = r4.zzb
            java.lang.String r3 = r5.zzb
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L27
            com.google.android.gms.internal.ads.zzaf[] r2 = r4.zzd
            com.google.android.gms.internal.ads.zzaf[] r5 = r5.zzd
            boolean r5 = java.util.Arrays.equals(r2, r5)
            if (r5 == 0) goto L27
            return r0
        L27:
            return r1
    }

    public final int hashCode() {
            r2 = this;
            int r0 = r2.zze
            if (r0 != 0) goto L17
            java.lang.String r0 = r2.zzb
            int r0 = r0.hashCode()
            int r0 = r0 + 527
            com.google.android.gms.internal.ads.zzaf[] r1 = r2.zzd
            int r0 = r0 * 31
            int r1 = java.util.Arrays.hashCode(r1)
            int r0 = r0 + r1
            r2.zze = r0
        L17:
            return r0
    }

    public final int zza(com.google.android.gms.internal.ads.zzaf r4) {
            r3 = this;
            r0 = 0
        L1:
            com.google.android.gms.internal.ads.zzaf[] r1 = r3.zzd
            int r2 = r1.length
            if (r0 >= r2) goto Le
            r1 = r1[r0]
            if (r4 != r1) goto Lb
            return r0
        Lb:
            int r0 = r0 + 1
            goto L1
        Le:
            r4 = -1
            return r4
    }

    public final com.google.android.gms.internal.ads.zzaf zzb(int r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzaf[] r0 = r1.zzd
            r2 = r0[r2]
            return r2
    }
}
