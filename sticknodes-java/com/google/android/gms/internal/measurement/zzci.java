package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzci {
    private static final java.lang.ThreadLocal zza = null;

    static {
            com.google.android.gms.internal.measurement.zzch r0 = new com.google.android.gms.internal.measurement.zzch
            r0.<init>()
            com.google.android.gms.internal.measurement.zzci.zza = r0
            return
    }

    public static android.content.SharedPreferences zza(android.content.Context r0, java.lang.String r1, int r2, com.google.android.gms.internal.measurement.zzcc r3) {
            com.google.android.gms.internal.measurement.zzbx.zza()
            java.lang.String r2 = ""
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L11
            com.google.android.gms.internal.measurement.zzcg r2 = new com.google.android.gms.internal.measurement.zzcg
            r2.<init>()
            goto L12
        L11:
            r2 = 0
        L12:
            if (r2 == 0) goto L15
            return r2
        L15:
            java.lang.ThreadLocal r2 = com.google.android.gms.internal.measurement.zzci.zza
            java.lang.Object r3 = r2.get()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            com.google.common.base.Preconditions.checkArgument(r3)
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r2.set(r3)
            r3 = 0
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r3)     // Catch: java.lang.Throwable -> L34
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r2.set(r1)
            return r0
        L34:
            r0 = move-exception
            java.lang.ThreadLocal r1 = com.google.android.gms.internal.measurement.zzci.zza
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r1.set(r2)
            throw r0
    }
}
