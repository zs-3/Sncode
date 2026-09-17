package org.fortheloss.sticknodespro;

/* loaded from: classes2.dex */
public class MyLicenseCheckerCallback implements com.google.android.vending.licensing.LicenseCheckerCallback {
    private org.fortheloss.sticknodespro.AndroidLauncher _androidLauncherRef;

    public MyLicenseCheckerCallback(org.fortheloss.sticknodespro.AndroidLauncher r1) {
            r0 = this;
            r0.<init>()
            r0._androidLauncherRef = r1
            return
    }

    @Override // com.google.android.vending.licensing.LicenseCheckerCallback
    public void allow(int r4) {
            r3 = this;
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "LicenseCheckerCallback allow(): "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.println(r4)
            org.fortheloss.sticknodespro.AndroidLauncher r4 = r3._androidLauncherRef
            if (r4 == 0) goto L1e
            r0 = 1
            r4.licenseCallbackResult(r0)
        L1e:
            return
    }

    @Override // com.google.android.vending.licensing.LicenseCheckerCallback
    public void applicationError(int r4) {
            r3 = this;
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "LicenseCheckerCallback applicationError(): "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.println(r4)
            org.fortheloss.sticknodespro.AndroidLauncher r4 = r3._androidLauncherRef
            if (r4 == 0) goto L1e
            r0 = 1
            r4.licenseCallbackResult(r0)
        L1e:
            return
    }

    @Override // com.google.android.vending.licensing.LicenseCheckerCallback
    public void dontAllow(int r4) {
            r3 = this;
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "LicenseCheckerCallback dontAllow(): "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.println(r1)
            org.fortheloss.sticknodespro.AndroidLauncher r0 = r3._androidLauncherRef
            if (r0 == 0) goto L27
            r1 = 561(0x231, float:7.86E-43)
            if (r4 != r1) goto L23
            r4 = 0
            r0.licenseCallbackResult(r4)
            goto L27
        L23:
            r4 = 1
            r0.licenseCallbackResult(r4)
        L27:
            return
    }
}
