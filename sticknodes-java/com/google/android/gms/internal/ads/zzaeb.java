package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzaeb {
    public static final com.google.android.gms.internal.ads.zzaeb zza = null;
    public final long zzb;
    public final long zzc;

    static {
            com.google.android.gms.internal.ads.zzaeb r0 = new com.google.android.gms.internal.ads.zzaeb
            r1 = 0
            r0.<init>(r1, r1)
            com.google.android.gms.internal.ads.zzaeb.zza = r0
            return
    }

    public zzaeb(long r1, long r3) {
            r0 = this;
            r0.<init>()
            r0.zzb = r1
            r0.zzc = r3
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
            java.lang.Class<com.google.android.gms.internal.ads.zzaeb> r2 = com.google.android.gms.internal.ads.zzaeb.class
            java.lang.Class r3 = r8.getClass()
            if (r2 == r3) goto L10
            goto L23
        L10:
            com.google.android.gms.internal.ads.zzaeb r8 = (com.google.android.gms.internal.ads.zzaeb) r8
            long r2 = r7.zzb
            long r4 = r8.zzb
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L23
            long r2 = r7.zzc
            long r4 = r8.zzc
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 != 0) goto L23
            return r0
        L23:
            return r1
    }

    public final int hashCode() {
            r4 = this;
            long r0 = r4.zzb
            int r1 = (int) r0
            long r2 = r4.zzc
            int r1 = r1 * 31
            int r0 = (int) r2
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "[timeUs="
            r0.append(r1)
            long r1 = r3.zzb
            r0.append(r1)
            java.lang.String r1 = ", position="
            r0.append(r1)
            long r1 = r3.zzc
            r0.append(r1)
            java.lang.String r1 = "]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
