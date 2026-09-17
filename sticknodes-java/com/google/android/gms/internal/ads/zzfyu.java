package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzfyu {
    private static final java.lang.Object zza = null;

    static {
            java.lang.Object r0 = zza()
            com.google.android.gms.internal.ads.zzfyu.zza = r0
            if (r0 == 0) goto L1a
            java.lang.Class<java.lang.Throwable> r1 = java.lang.Throwable.class
            r2 = 2
            java.lang.Class[] r2 = new java.lang.Class[r2]
            r3 = 0
            r2[r3] = r1
            r1 = 1
            java.lang.Class r3 = java.lang.Integer.TYPE
            r2[r1] = r3
            java.lang.String r1 = "getStackTraceElement"
            zzb(r1, r2)
        L1a:
            if (r0 != 0) goto L1d
            return
        L1d:
            zzc(r0)
            return
    }

    private static java.lang.Object zza() {
            r0 = 0
            java.lang.String r1 = "sun.misc.SharedSecrets"
            r2 = 0
            java.lang.Class r1 = java.lang.Class.forName(r1, r2, r0)     // Catch: java.lang.Throwable -> L16 java.lang.ThreadDeath -> L17
            java.lang.String r3 = "getJavaLangAccess"
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L16 java.lang.ThreadDeath -> L17
            java.lang.reflect.Method r1 = r1.getMethod(r3, r4)     // Catch: java.lang.Throwable -> L16 java.lang.ThreadDeath -> L17
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L16 java.lang.ThreadDeath -> L17
            java.lang.Object r0 = r1.invoke(r0, r2)     // Catch: java.lang.Throwable -> L16 java.lang.ThreadDeath -> L17
        L16:
            return r0
        L17:
            r0 = move-exception
            throw r0
    }

    private static java.lang.reflect.Method zzb(java.lang.String r3, java.lang.Class... r4) throws java.lang.ThreadDeath {
            r0 = 0
            java.lang.String r1 = "sun.misc.JavaLangAccess"
            r2 = 0
            java.lang.Class r1 = java.lang.Class.forName(r1, r2, r0)     // Catch: java.lang.Throwable -> Ld java.lang.ThreadDeath -> Le
            java.lang.reflect.Method r3 = r1.getMethod(r3, r4)     // Catch: java.lang.Throwable -> Ld java.lang.ThreadDeath -> Le
            return r3
        Ld:
            return r0
        Le:
            r3 = move-exception
            throw r3
    }

    private static java.lang.reflect.Method zzc(java.lang.Object r6) {
            r0 = 0
            java.lang.String r1 = "getStackTraceDepth"
            r2 = 1
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L1f
            java.lang.Class<java.lang.Throwable> r4 = java.lang.Throwable.class
            r5 = 0
            r3[r5] = r4     // Catch: java.lang.Throwable -> L1f
            java.lang.reflect.Method r1 = zzb(r1, r3)     // Catch: java.lang.Throwable -> L1f
            if (r1 != 0) goto L12
            return r0
        L12:
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L1f
            java.lang.Throwable r3 = new java.lang.Throwable     // Catch: java.lang.Throwable -> L1f
            r3.<init>()     // Catch: java.lang.Throwable -> L1f
            r2[r5] = r3     // Catch: java.lang.Throwable -> L1f
            r1.invoke(r6, r2)     // Catch: java.lang.Throwable -> L1f
            return r1
        L1f:
            return r0
    }
}
