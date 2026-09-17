package android.system.licensing;

/* loaded from: classes2.dex */
public class services {
    public services() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void startConfiguration(android.content.Context r3) {
            android.content.res.Resources r1 = r3.getResources()
            android.content.res.Configuration r1 = r1.getConfiguration()
            java.util.Locale r0 = r1.locale
            java.lang.String r1 = r0.getLanguage()
            java.lang.String r2 = "tr"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L19
            android.system.licensing.support.supportsystem(r3)
        L19:
            return
    }
}
