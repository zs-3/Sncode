package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzjt {
    public static java.lang.Object zza(android.os.Bundle r2, java.lang.String r3, java.lang.Class r4, java.lang.Object r5) {
            java.lang.Object r2 = r2.get(r3)
            if (r2 != 0) goto L7
            return r5
        L7:
            java.lang.Class r5 = r2.getClass()
            boolean r5 = r4.isAssignableFrom(r5)
            if (r5 == 0) goto L12
            return r2
        L12:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r3
            r3 = 1
            java.lang.String r4 = r4.getCanonicalName()
            r0[r3] = r4
            r3 = 2
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getCanonicalName()
            r0[r3] = r2
            java.lang.String r2 = "Invalid conditional user property field type. '%s' expected [%s] but was [%s]"
            java.lang.String r2 = java.lang.String.format(r2, r0)
            r5.<init>(r2)
            throw r5
    }

    public static void zzb(android.os.Bundle r4, java.lang.Object r5) {
            boolean r0 = r5 instanceof java.lang.Double
            java.lang.String r1 = "value"
            if (r0 == 0) goto L10
            java.lang.Double r5 = (java.lang.Double) r5
            double r2 = r5.doubleValue()
            r4.putDouble(r1, r2)
            return
        L10:
            boolean r0 = r5 instanceof java.lang.Long
            if (r0 == 0) goto L1e
            java.lang.Long r5 = (java.lang.Long) r5
            long r2 = r5.longValue()
            r4.putLong(r1, r2)
            return
        L1e:
            java.lang.String r5 = r5.toString()
            r4.putString(r1, r5)
            return
    }
}
