package com.google.android.gms.ads.nonagon.util.logging.csi;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public class CsiUrlBuilder {
    private final java.lang.String zza;

    public CsiUrlBuilder() {
            r1 = this;
            r1.<init>()
            com.google.android.gms.internal.ads.zzbeb r0 = com.google.android.gms.internal.ads.zzbel.zza
            java.lang.Object r0 = r0.zze()
            java.lang.String r0 = (java.lang.String) r0
            r1.zza = r0
            return
    }

    public java.lang.String generateUrl(java.util.Map<java.lang.String, java.lang.String> r4) {
            r3 = this;
            java.lang.String r0 = r3.zza
            android.net.Uri r0 = android.net.Uri.parse(r0)
            android.net.Uri$Builder r0 = r0.buildUpon()
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L12:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L2e
            java.lang.Object r1 = r4.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            r0.appendQueryParameter(r2, r1)
            goto L12
        L2e:
            android.net.Uri r4 = r0.build()
            java.lang.String r4 = r4.toString()
            return r4
    }
}
