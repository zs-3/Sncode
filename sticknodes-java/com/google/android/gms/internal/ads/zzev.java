package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzev {
    public static java.lang.String zza(org.xmlpull.v1.XmlPullParser r3, java.lang.String r4) {
            int r0 = r3.getAttributeCount()
            r1 = 0
        L5:
            if (r1 >= r0) goto L19
            java.lang.String r2 = r3.getAttributeName(r1)
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L16
            java.lang.String r3 = r3.getAttributeValue(r1)
            return r3
        L16:
            int r1 = r1 + 1
            goto L5
        L19:
            r3 = 0
            return r3
    }

    public static boolean zzb(org.xmlpull.v1.XmlPullParser r2, java.lang.String r3) throws org.xmlpull.v1.XmlPullParserException {
            int r0 = r2.getEventType()
            r1 = 3
            if (r0 != r1) goto L13
            java.lang.String r2 = r2.getName()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L13
            r2 = 1
            return r2
        L13:
            r2 = 0
            return r2
    }

    public static boolean zzc(org.xmlpull.v1.XmlPullParser r2, java.lang.String r3) throws org.xmlpull.v1.XmlPullParserException {
            int r0 = r2.getEventType()
            r1 = 2
            if (r0 != r1) goto L13
            java.lang.String r2 = r2.getName()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L13
            r2 = 1
            return r2
        L13:
            r2 = 0
            return r2
    }
}
