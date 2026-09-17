package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzdup {
    private final com.google.android.gms.common.util.Clock zza;

    public zzdup(com.google.android.gms.common.util.Clock r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    public final void zza(java.util.List r6, java.lang.String r7, java.lang.String r8, java.lang.Object... r9) {
            r5 = this;
            com.google.android.gms.internal.ads.zzbeb r0 = com.google.android.gms.internal.ads.zzbet.zza
            java.lang.Object r0 = r0.zze()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto Lf
            return
        Lf:
            com.google.android.gms.common.util.Clock r0 = r5.zza
            long r0 = r0.currentTimeMillis()
            java.io.StringWriter r2 = new java.io.StringWriter
            r2.<init>()
            android.util.JsonWriter r3 = new android.util.JsonWriter
            r3.<init>(r2)
            r3.beginObject()     // Catch: java.io.IOException -> L89
            java.lang.String r4 = "timestamp"
            android.util.JsonWriter r4 = r3.name(r4)     // Catch: java.io.IOException -> L89
            r4.value(r0)     // Catch: java.io.IOException -> L89
            java.lang.String r0 = "source"
            android.util.JsonWriter r0 = r3.name(r0)     // Catch: java.io.IOException -> L89
            r0.value(r7)     // Catch: java.io.IOException -> L89
            java.lang.String r7 = "event"
            android.util.JsonWriter r7 = r3.name(r7)     // Catch: java.io.IOException -> L89
            r7.value(r8)     // Catch: java.io.IOException -> L89
            java.lang.String r7 = "components"
            android.util.JsonWriter r7 = r3.name(r7)     // Catch: java.io.IOException -> L89
            r7.beginArray()     // Catch: java.io.IOException -> L89
            java.util.Iterator r6 = r6.iterator()     // Catch: java.io.IOException -> L89
        L4a:
            boolean r7 = r6.hasNext()     // Catch: java.io.IOException -> L89
            if (r7 == 0) goto L5c
            java.lang.Object r7 = r6.next()     // Catch: java.io.IOException -> L89
            java.lang.String r7 = r7.toString()     // Catch: java.io.IOException -> L89
            r3.value(r7)     // Catch: java.io.IOException -> L89
            goto L4a
        L5c:
            r3.endArray()     // Catch: java.io.IOException -> L89
            java.lang.String r6 = "params"
            android.util.JsonWriter r6 = r3.name(r6)     // Catch: java.io.IOException -> L89
            r6.beginArray()     // Catch: java.io.IOException -> L89
            int r6 = r9.length     // Catch: java.io.IOException -> L89
            r7 = 0
        L6a:
            if (r7 >= r6) goto L7c
            r8 = r9[r7]     // Catch: java.io.IOException -> L89
            if (r8 == 0) goto L75
            java.lang.String r8 = r8.toString()     // Catch: java.io.IOException -> L89
            goto L76
        L75:
            r8 = 0
        L76:
            r3.value(r8)     // Catch: java.io.IOException -> L89
            int r7 = r7 + 1
            goto L6a
        L7c:
            r3.endArray()     // Catch: java.io.IOException -> L89
            r3.endObject()     // Catch: java.io.IOException -> L89
            r3.flush()     // Catch: java.io.IOException -> L89
            r3.close()     // Catch: java.io.IOException -> L89
            goto L8f
        L89:
            r6 = move-exception
            java.lang.String r7 = "unable to log"
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r7, r6)
        L8f:
            java.lang.String r6 = r2.toString()
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r7 = "AD-DBG "
            java.lang.String r6 = r7.concat(r6)
            com.google.android.gms.ads.internal.util.client.zzm.zzi(r6)
            return
    }
}
