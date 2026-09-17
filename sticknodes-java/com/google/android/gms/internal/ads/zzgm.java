package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzgm {
    public static final /* synthetic */ int zzh = 0;
    public final android.net.Uri zza;
    public final int zzb;
    public final byte[] zzc;
    public final java.util.Map zzd;
    public final long zze;
    public final long zzf;
    public final int zzg;

    static {
            java.lang.String r0 = "media3.datasource"
            com.google.android.gms.internal.ads.zzbd.zzb(r0)
            return
    }

    private zzgm(android.net.Uri r3, long r4, int r6, byte[] r7, java.util.Map r8, long r9, long r11, java.lang.String r13, int r14, java.lang.Object r15) {
            r2 = this;
            r2.<init>()
            r4 = 0
            r5 = 0
            r7 = 1
            int r13 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r13 < 0) goto Ld
            r13 = 1
            goto Le
        Ld:
            r13 = 0
        Le:
            com.google.android.gms.internal.ads.zzdi.zzd(r13)
            com.google.android.gms.internal.ads.zzdi.zzd(r13)
            r0 = -1
            int r13 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r13 > 0) goto L1f
            int r5 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r5 != 0) goto L20
            r11 = r0
        L1f:
            r4 = 1
        L20:
            com.google.android.gms.internal.ads.zzdi.zzd(r4)
            java.util.Objects.requireNonNull(r3)
            r2.zza = r3
            r2.zzb = r7
            r3 = 0
            r2.zzc = r3
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>(r8)
            java.util.Map r3 = java.util.Collections.unmodifiableMap(r3)
            r2.zzd = r3
            r2.zze = r9
            r2.zzf = r11
            r2.zzg = r14
            return
    }

    /* synthetic */ zzgm(android.net.Uri r15, long r16, int r18, byte[] r19, java.util.Map r20, long r21, long r23, java.lang.String r25, int r26, java.lang.Object r27, com.google.android.gms.internal.ads.zzgl r28) {
            r14 = this;
            r2 = 0
            r4 = 1
            r5 = 0
            r11 = 0
            r13 = 0
            r0 = r14
            r1 = r15
            r6 = r20
            r7 = r21
            r9 = r23
            r12 = r26
            r0.<init>(r1, r2, r4, r5, r6, r7, r9, r11, r12, r13)
            return
    }

    @java.lang.Deprecated
    public zzgm(android.net.Uri r15, long r16, long r18, java.lang.String r20) {
            r14 = this;
            java.util.Map r6 = java.util.Collections.emptyMap()
            r2 = 0
            r4 = 1
            r5 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r0 = r14
            r1 = r15
            r7 = r16
            r9 = r18
            r0.<init>(r1, r2, r4, r5, r6, r7, r9, r11, r12, r13)
            return
    }

    public final java.lang.String toString() {
            r4 = this;
            android.net.Uri r0 = r4.zza
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "DataSpec["
            r1.append(r2)
            java.lang.String r2 = "GET"
            r1.append(r2)
            java.lang.String r2 = " "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = ", "
            r1.append(r0)
            long r2 = r4.zze
            r1.append(r2)
            r1.append(r0)
            long r2 = r4.zzf
            r1.append(r2)
            java.lang.String r0 = ", null, "
            r1.append(r0)
            int r0 = r4.zzg
            r1.append(r0)
            java.lang.String r0 = "]"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }

    public final com.google.android.gms.internal.ads.zzgk zza() {
            r2 = this;
            com.google.android.gms.internal.ads.zzgk r0 = new com.google.android.gms.internal.ads.zzgk
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    public final boolean zzb(int r2) {
            r1 = this;
            int r0 = r1.zzg
            r0 = r0 & r2
            if (r0 != r2) goto L7
            r2 = 1
            return r2
        L7:
            r2 = 0
            return r2
    }
}
