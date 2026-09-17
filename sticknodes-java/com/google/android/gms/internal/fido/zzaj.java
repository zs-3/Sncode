package com.google.android.gms.internal.fido;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
/* loaded from: classes.dex */
public final class zzaj {
    private final java.lang.String zza;
    private final com.google.android.gms.internal.fido.zzah zzb;
    private com.google.android.gms.internal.fido.zzah zzc;

    /* synthetic */ zzaj(java.lang.String r2, com.google.android.gms.internal.fido.zzai r3) {
            r1 = this;
            r1.<init>()
            com.google.android.gms.internal.fido.zzah r3 = new com.google.android.gms.internal.fido.zzah
            r0 = 0
            r3.<init>(r0)
            r1.zzb = r3
            r1.zzc = r3
            java.util.Objects.requireNonNull(r2)
            r1.zza = r2
            return
    }

    public final java.lang.String toString() {
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 32
            r0.<init>(r1)
            java.lang.String r1 = r6.zza
            r0.append(r1)
            r1 = 123(0x7b, float:1.72E-43)
            r0.append(r1)
            com.google.android.gms.internal.fido.zzah r1 = r6.zzb
            com.google.android.gms.internal.fido.zzah r1 = r1.zzc
            java.lang.String r2 = ""
        L17:
            if (r1 == 0) goto L54
            java.lang.Object r3 = r1.zzb
            boolean r4 = r1 instanceof com.google.android.gms.internal.fido.zzaf
            r0.append(r2)
            java.lang.String r2 = r1.zza
            if (r2 == 0) goto L2c
            r0.append(r2)
            r2 = 61
            r0.append(r2)
        L2c:
            if (r3 == 0) goto L4c
            java.lang.Class r2 = r3.getClass()
            boolean r2 = r2.isArray()
            if (r2 == 0) goto L4c
            r2 = 1
            java.lang.Object[] r4 = new java.lang.Object[r2]
            r5 = 0
            r4[r5] = r3
            java.lang.String r3 = java.util.Arrays.deepToString(r4)
            int r4 = r3.length()
            int r4 = r4 + (-1)
            r0.append(r3, r2, r4)
            goto L4f
        L4c:
            r0.append(r3)
        L4f:
            com.google.android.gms.internal.fido.zzah r1 = r1.zzc
            java.lang.String r2 = ", "
            goto L17
        L54:
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public final com.google.android.gms.internal.fido.zzaj zza(java.lang.String r2, int r3) {
            r1 = this;
            java.lang.String r2 = java.lang.String.valueOf(r3)
            com.google.android.gms.internal.fido.zzaf r3 = new com.google.android.gms.internal.fido.zzaf
            r0 = 0
            r3.<init>(r0)
            com.google.android.gms.internal.fido.zzah r0 = r1.zzc
            r0.zzc = r3
            r1.zzc = r3
            r3.zzb = r2
            java.lang.String r2 = "errorCode"
            r3.zza = r2
            return r1
    }

    public final com.google.android.gms.internal.fido.zzaj zzb(java.lang.String r3, java.lang.Object r4) {
            r2 = this;
            com.google.android.gms.internal.fido.zzah r0 = new com.google.android.gms.internal.fido.zzah
            r1 = 0
            r0.<init>(r1)
            com.google.android.gms.internal.fido.zzah r1 = r2.zzc
            r1.zzc = r0
            r2.zzc = r0
            r0.zzb = r4
            r0.zza = r3
            return r2
    }
}
