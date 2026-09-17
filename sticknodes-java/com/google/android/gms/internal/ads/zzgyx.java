package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzgyx {
    private final byte[] zza;

    private zzgyx(byte[] r2, int r3, int r4) {
            r1 = this;
            r1.<init>()
            byte[] r3 = new byte[r4]
            r1.zza = r3
            r0 = 0
            java.lang.System.arraycopy(r2, r0, r3, r0, r4)
            return
    }

    public static com.google.android.gms.internal.ads.zzgyx zzb(byte[] r3) {
            java.lang.String r0 = "data must be non-null"
            java.util.Objects.requireNonNull(r3, r0)
            com.google.android.gms.internal.ads.zzgyx r0 = new com.google.android.gms.internal.ads.zzgyx
            r1 = 0
            int r2 = r3.length
            r0.<init>(r3, r1, r2)
            return r0
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.google.android.gms.internal.ads.zzgyx
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            com.google.android.gms.internal.ads.zzgyx r2 = (com.google.android.gms.internal.ads.zzgyx) r2
            byte[] r2 = r2.zza
            byte[] r0 = r1.zza
            boolean r2 = java.util.Arrays.equals(r2, r0)
            return r2
    }

    public final int hashCode() {
            r1 = this;
            byte[] r0 = r1.zza
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }

    public final java.lang.String toString() {
            r6 = this;
            byte[] r0 = r6.zza
            int r1 = r0.length
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r1 = r1 + r1
            r2.<init>(r1)
            r1 = 0
        La:
            int r3 = r0.length
            if (r1 >= r3) goto L28
            r3 = r0[r1]
            r3 = r3 & 255(0xff, float:3.57E-43)
            java.lang.String r4 = "0123456789abcdef"
            int r5 = r3 >> 4
            char r5 = r4.charAt(r5)
            r2.append(r5)
            r3 = r3 & 15
            char r3 = r4.charAt(r3)
            r2.append(r3)
            int r1 = r1 + 1
            goto La
        L28:
            java.lang.String r0 = r2.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Bytes("
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = ")"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }

    public final int zza() {
            r1 = this;
            byte[] r0 = r1.zza
            int r0 = r0.length
            return r0
    }

    public final byte[] zzc() {
            r4 = this;
            byte[] r0 = r4.zza
            int r1 = r0.length
            byte[] r2 = new byte[r1]
            r3 = 0
            java.lang.System.arraycopy(r0, r3, r2, r3, r1)
            return r2
    }
}
