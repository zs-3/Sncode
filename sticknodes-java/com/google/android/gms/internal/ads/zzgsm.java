package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzgsm extends com.google.android.gms.internal.ads.zzgsp {
    private final int zza;
    private final int zzb;
    private final com.google.android.gms.internal.ads.zzgsk zzc;
    private final com.google.android.gms.internal.ads.zzgsj zzd;

    /* synthetic */ zzgsm(int r1, int r2, com.google.android.gms.internal.ads.zzgsk r3, com.google.android.gms.internal.ads.zzgsj r4, com.google.android.gms.internal.ads.zzgsl r5) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            return
    }

    public static com.google.android.gms.internal.ads.zzgsi zze() {
            com.google.android.gms.internal.ads.zzgsi r0 = new com.google.android.gms.internal.ads.zzgsi
            r1 = 0
            r0.<init>(r1)
            return r0
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof com.google.android.gms.internal.ads.zzgsm
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.google.android.gms.internal.ads.zzgsm r4 = (com.google.android.gms.internal.ads.zzgsm) r4
            int r0 = r4.zza
            int r2 = r3.zza
            if (r0 != r2) goto L26
            int r0 = r4.zzd()
            int r2 = r3.zzd()
            if (r0 != r2) goto L26
            com.google.android.gms.internal.ads.zzgsk r0 = r4.zzc
            com.google.android.gms.internal.ads.zzgsk r2 = r3.zzc
            if (r0 != r2) goto L26
            com.google.android.gms.internal.ads.zzgsj r4 = r4.zzd
            com.google.android.gms.internal.ads.zzgsj r0 = r3.zzd
            if (r4 != r0) goto L26
            r4 = 1
            return r4
        L26:
            return r1
    }

    public final int hashCode() {
            r3 = this;
            java.lang.Class<com.google.android.gms.internal.ads.zzgsm> r0 = com.google.android.gms.internal.ads.zzgsm.class
            r1 = 5
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r0
            int r0 = r3.zza
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2 = 1
            r1[r2] = r0
            int r0 = r3.zzb
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2 = 2
            r1[r2] = r0
            com.google.android.gms.internal.ads.zzgsk r0 = r3.zzc
            r2 = 3
            r1[r2] = r0
            com.google.android.gms.internal.ads.zzgsj r0 = r3.zzd
            r2 = 4
            r1[r2] = r0
            int r0 = java.util.Objects.hash(r1)
            return r0
    }

    public final java.lang.String toString() {
            r4 = this;
            com.google.android.gms.internal.ads.zzgsj r0 = r4.zzd
            com.google.android.gms.internal.ads.zzgsk r1 = r4.zzc
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "HMAC Parameters (variant: "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = ", hashType: "
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = ", "
            r2.append(r0)
            int r0 = r4.zzb
            r2.append(r0)
            java.lang.String r0 = "-byte tags, and "
            r2.append(r0)
            int r0 = r4.zza
            r2.append(r0)
            java.lang.String r0 = "-byte key)"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzghs
    public final boolean zza() {
            r2 = this;
            com.google.android.gms.internal.ads.zzgsk r0 = r2.zzc
            com.google.android.gms.internal.ads.zzgsk r1 = com.google.android.gms.internal.ads.zzgsk.zzd
            if (r0 == r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public final int zzb() {
            r1 = this;
            int r0 = r1.zzb
            return r0
    }

    public final int zzc() {
            r1 = this;
            int r0 = r1.zza
            return r0
    }

    public final int zzd() {
            r2 = this;
            com.google.android.gms.internal.ads.zzgsk r0 = r2.zzc
            com.google.android.gms.internal.ads.zzgsk r1 = com.google.android.gms.internal.ads.zzgsk.zzd
            if (r0 != r1) goto L9
            int r0 = r2.zzb
            return r0
        L9:
            com.google.android.gms.internal.ads.zzgsk r1 = com.google.android.gms.internal.ads.zzgsk.zza
            if (r0 != r1) goto Le
            goto L17
        Le:
            com.google.android.gms.internal.ads.zzgsk r1 = com.google.android.gms.internal.ads.zzgsk.zzb
            if (r0 != r1) goto L13
            goto L17
        L13:
            com.google.android.gms.internal.ads.zzgsk r1 = com.google.android.gms.internal.ads.zzgsk.zzc
            if (r0 != r1) goto L1c
        L17:
            int r0 = r2.zzb
            int r0 = r0 + 5
            return r0
        L1c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Unknown variant"
            r0.<init>(r1)
            throw r0
    }

    public final com.google.android.gms.internal.ads.zzgsj zzf() {
            r1 = this;
            com.google.android.gms.internal.ads.zzgsj r0 = r1.zzd
            return r0
    }

    public final com.google.android.gms.internal.ads.zzgsk zzg() {
            r1 = this;
            com.google.android.gms.internal.ads.zzgsk r0 = r1.zzc
            return r0
    }
}
