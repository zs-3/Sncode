package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes.dex */
final class zzdn implements java.io.Serializable, com.google.android.gms.internal.auth.zzdj {
    final java.lang.Object zza;

    zzdn(java.lang.Object r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof com.google.android.gms.internal.auth.zzdn
            r1 = 0
            if (r0 == 0) goto L17
            com.google.android.gms.internal.auth.zzdn r3 = (com.google.android.gms.internal.auth.zzdn) r3
            java.lang.Object r0 = r2.zza
            java.lang.Object r3 = r3.zza
            if (r0 == r3) goto L15
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L14
            goto L15
        L14:
            return r1
        L15:
            r3 = 1
            return r3
        L17:
            return r1
    }

    public final int hashCode() {
            r3 = this;
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Object r1 = r3.zza
            r2 = 0
            r0[r2] = r1
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.Object r0 = r3.zza
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Suppliers.ofInstance("
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = ")"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }

    @Override // com.google.android.gms.internal.auth.zzdj
    public final java.lang.Object zza() {
            r1 = this;
            java.lang.Object r0 = r1.zza
            return r0
    }
}
