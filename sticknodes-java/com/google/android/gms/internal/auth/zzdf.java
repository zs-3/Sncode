package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes.dex */
final class zzdf extends com.google.android.gms.internal.auth.zzdh {
    static final com.google.android.gms.internal.auth.zzdf zza = null;

    static {
            com.google.android.gms.internal.auth.zzdf r0 = new com.google.android.gms.internal.auth.zzdf
            r0.<init>()
            com.google.android.gms.internal.auth.zzdf.zza = r0
            return
    }

    private zzdf() {
            r0 = this;
            r0.<init>()
            return
    }

    public final boolean equals(java.lang.Object r1) {
            r0 = this;
            if (r1 != r0) goto L4
            r1 = 1
            return r1
        L4:
            r1 = 0
            return r1
    }

    public final int hashCode() {
            r1 = this;
            r0 = 2040732332(0x79a31aac, float:1.0586067E35)
            return r0
    }

    public final java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = "Optional.absent()"
            return r0
    }

    @Override // com.google.android.gms.internal.auth.zzdh
    public final java.lang.Object zza() {
            r2 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Optional.get() cannot be called on an absent value"
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.android.gms.internal.auth.zzdh
    public final boolean zzb() {
            r1 = this;
            r0 = 0
            return r0
    }
}
