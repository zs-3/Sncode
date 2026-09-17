package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzady {
    public final com.google.android.gms.internal.ads.zzaeb zza;
    public final com.google.android.gms.internal.ads.zzaeb zzb;

    public zzady(com.google.android.gms.internal.ads.zzaeb r1, com.google.android.gms.internal.ads.zzaeb r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
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
            java.lang.Class<com.google.android.gms.internal.ads.zzady> r2 = com.google.android.gms.internal.ads.zzady.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L27
        L10:
            com.google.android.gms.internal.ads.zzady r5 = (com.google.android.gms.internal.ads.zzady) r5
            com.google.android.gms.internal.ads.zzaeb r2 = r4.zza
            com.google.android.gms.internal.ads.zzaeb r3 = r5.zza
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L27
            com.google.android.gms.internal.ads.zzaeb r2 = r4.zzb
            com.google.android.gms.internal.ads.zzaeb r5 = r5.zzb
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L27
            return r0
        L27:
            return r1
    }

    public final int hashCode() {
            r2 = this;
            com.google.android.gms.internal.ads.zzaeb r0 = r2.zza
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            com.google.android.gms.internal.ads.zzaeb r1 = r2.zzb
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r4 = this;
            com.google.android.gms.internal.ads.zzaeb r0 = r4.zza
            com.google.android.gms.internal.ads.zzaeb r1 = r4.zzb
            java.lang.String r2 = r0.toString()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L11
            java.lang.String r0 = ""
            goto L1d
        L11:
            com.google.android.gms.internal.ads.zzaeb r0 = r4.zzb
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = ", "
            java.lang.String r0 = r1.concat(r0)
        L1d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "["
            r1.append(r3)
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = "]"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }
}
