package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzlw {
    public static final com.google.android.gms.internal.ads.zzlw zza = null;
    public static final com.google.android.gms.internal.ads.zzlw zzb = null;
    public final long zzc;
    public final long zzd;

    static {
            com.google.android.gms.internal.ads.zzlw r0 = new com.google.android.gms.internal.ads.zzlw
            r1 = 0
            r0.<init>(r1, r1)
            com.google.android.gms.internal.ads.zzlw.zza = r0
            com.google.android.gms.internal.ads.zzlw r3 = new com.google.android.gms.internal.ads.zzlw
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r3.<init>(r4, r4)
            com.google.android.gms.internal.ads.zzlw r3 = new com.google.android.gms.internal.ads.zzlw
            r3.<init>(r4, r1)
            com.google.android.gms.internal.ads.zzlw r3 = new com.google.android.gms.internal.ads.zzlw
            r3.<init>(r1, r4)
            com.google.android.gms.internal.ads.zzlw.zzb = r0
            return
    }

    public zzlw(long r6, long r8) {
            r5 = this;
            r5.<init>()
            r0 = 1
            r1 = 0
            r2 = 0
            int r4 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r4 < 0) goto Ld
            r4 = 1
            goto Le
        Ld:
            r4 = 0
        Le:
            com.google.android.gms.internal.ads.zzdi.zzd(r4)
            int r4 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r4 < 0) goto L16
            goto L17
        L16:
            r0 = 0
        L17:
            com.google.android.gms.internal.ads.zzdi.zzd(r0)
            r5.zzc = r6
            r5.zzd = r8
            return
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            r1 = 0
            if (r8 == 0) goto L23
            java.lang.Class<com.google.android.gms.internal.ads.zzlw> r2 = com.google.android.gms.internal.ads.zzlw.class
            java.lang.Class r3 = r8.getClass()
            if (r2 == r3) goto L10
            goto L23
        L10:
            com.google.android.gms.internal.ads.zzlw r8 = (com.google.android.gms.internal.ads.zzlw) r8
            long r2 = r7.zzc
            long r4 = r8.zzc
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L23
            long r2 = r7.zzd
            long r4 = r8.zzd
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 != 0) goto L23
            return r0
        L23:
            return r1
    }

    public final int hashCode() {
            r4 = this;
            long r0 = r4.zzc
            int r1 = (int) r0
            long r2 = r4.zzd
            int r1 = r1 * 31
            int r0 = (int) r2
            int r1 = r1 + r0
            return r1
    }
}
