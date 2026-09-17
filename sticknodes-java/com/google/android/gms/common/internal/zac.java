package com.google.android.gms.common.internal;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes.dex */
public final class zac {
    private static final androidx.collection.SimpleArrayMap zaa = null;
    private static java.util.Locale zab;

    static {
            androidx.collection.SimpleArrayMap r0 = new androidx.collection.SimpleArrayMap
            r0.<init>()
            com.google.android.gms.common.internal.zac.zaa = r0
            return
    }

    public static java.lang.String zaa(android.content.Context r2) {
            java.lang.String r0 = r2.getPackageName()
            com.google.android.gms.common.wrappers.PackageManagerWrapper r1 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r2)     // Catch: java.lang.Throwable -> L11
            java.lang.CharSequence r1 = r1.getApplicationLabel(r0)     // Catch: java.lang.Throwable -> L11
            java.lang.String r2 = r1.toString()     // Catch: java.lang.Throwable -> L11
            return r2
        L11:
            android.content.pm.ApplicationInfo r2 = r2.getApplicationInfo()
            java.lang.String r2 = r2.name
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            if (r1 == 0) goto L1f
            return r0
        L1f:
            return r2
    }

    public static java.lang.String zab(android.content.Context r1, int r2) {
            android.content.res.Resources r1 = r1.getResources()
            r0 = 1
            if (r2 == r0) goto L23
            r0 = 2
            if (r2 == r0) goto L1c
            r0 = 3
            if (r2 == r0) goto L15
            r2 = 17039370(0x104000a, float:2.42446E-38)
            java.lang.String r1 = r1.getString(r2)
            return r1
        L15:
            int r2 = com.google.android.gms.base.R.string.common_google_play_services_enable_button
            java.lang.String r1 = r1.getString(r2)
            return r1
        L1c:
            int r2 = com.google.android.gms.base.R.string.common_google_play_services_update_button
            java.lang.String r1 = r1.getString(r2)
            return r1
        L23:
            int r2 = com.google.android.gms.base.R.string.common_google_play_services_install_button
            java.lang.String r1 = r1.getString(r2)
            return r1
    }

    public static java.lang.String zac(android.content.Context r5, int r6) {
            android.content.res.Resources r0 = r5.getResources()
            java.lang.String r1 = zaa(r5)
            r2 = 0
            r3 = 1
            if (r6 == r3) goto L8a
            r4 = 2
            if (r6 == r4) goto L72
            r4 = 3
            if (r6 == r4) goto L67
            r4 = 5
            if (r6 == r4) goto L60
            r4 = 7
            if (r6 == r4) goto L59
            r4 = 9
            if (r6 == r4) goto L4e
            r4 = 20
            if (r6 == r4) goto L47
            switch(r6) {
                case 16: goto L40;
                case 17: goto L39;
                case 18: goto L2e;
                default: goto L23;
            }
        L23:
            int r5 = com.google.android.gms.common.R.string.common_google_play_services_unknown_issue
            java.lang.Object[] r6 = new java.lang.Object[r3]
            r6[r2] = r1
            java.lang.String r5 = r0.getString(r5, r6)
            return r5
        L2e:
            int r5 = com.google.android.gms.base.R.string.common_google_play_services_updating_text
            java.lang.Object[] r6 = new java.lang.Object[r3]
            r6[r2] = r1
            java.lang.String r5 = r0.getString(r5, r6)
            return r5
        L39:
            java.lang.String r6 = "common_google_play_services_sign_in_failed_text"
            java.lang.String r5 = zag(r5, r6, r1)
            return r5
        L40:
            java.lang.String r6 = "common_google_play_services_api_unavailable_text"
            java.lang.String r5 = zag(r5, r6, r1)
            return r5
        L47:
            java.lang.String r6 = "common_google_play_services_restricted_profile_text"
            java.lang.String r5 = zag(r5, r6, r1)
            return r5
        L4e:
            int r5 = com.google.android.gms.base.R.string.common_google_play_services_unsupported_text
            java.lang.Object[] r6 = new java.lang.Object[r3]
            r6[r2] = r1
            java.lang.String r5 = r0.getString(r5, r6)
            return r5
        L59:
            java.lang.String r6 = "common_google_play_services_network_error_text"
            java.lang.String r5 = zag(r5, r6, r1)
            return r5
        L60:
            java.lang.String r6 = "common_google_play_services_invalid_account_text"
            java.lang.String r5 = zag(r5, r6, r1)
            return r5
        L67:
            int r5 = com.google.android.gms.base.R.string.common_google_play_services_enable_text
            java.lang.Object[] r6 = new java.lang.Object[r3]
            r6[r2] = r1
            java.lang.String r5 = r0.getString(r5, r6)
            return r5
        L72:
            boolean r5 = com.google.android.gms.common.util.DeviceProperties.isWearableWithoutPlayStore(r5)
            if (r5 == 0) goto L7f
            int r5 = com.google.android.gms.base.R.string.common_google_play_services_wear_update_text
            java.lang.String r5 = r0.getString(r5)
            return r5
        L7f:
            int r5 = com.google.android.gms.base.R.string.common_google_play_services_update_text
            java.lang.Object[] r6 = new java.lang.Object[r3]
            r6[r2] = r1
            java.lang.String r5 = r0.getString(r5, r6)
            return r5
        L8a:
            int r5 = com.google.android.gms.base.R.string.common_google_play_services_install_text
            java.lang.Object[] r6 = new java.lang.Object[r3]
            r6[r2] = r1
            java.lang.String r5 = r0.getString(r5, r6)
            return r5
    }

    public static java.lang.String zad(android.content.Context r1, int r2) {
            r0 = 6
            if (r2 == r0) goto Ld
            r0 = 19
            if (r2 != r0) goto L8
            goto Ld
        L8:
            java.lang.String r1 = zac(r1, r2)
            return r1
        Ld:
            java.lang.String r2 = zaa(r1)
            java.lang.String r0 = "common_google_play_services_resolution_required_text"
            java.lang.String r1 = zag(r1, r0, r2)
            return r1
    }

    public static java.lang.String zae(android.content.Context r1, int r2) {
            r0 = 6
            if (r2 != r0) goto La
            java.lang.String r2 = "common_google_play_services_resolution_required_title"
            java.lang.String r2 = zah(r1, r2)
            goto Le
        La:
            java.lang.String r2 = zaf(r1, r2)
        Le:
            if (r2 != 0) goto L1b
            android.content.res.Resources r1 = r1.getResources()
            int r2 = com.google.android.gms.base.R.string.common_google_play_services_notification_ticker
            java.lang.String r1 = r1.getString(r2)
            return r1
        L1b:
            return r2
    }

    public static java.lang.String zaf(android.content.Context r3, int r4) {
            android.content.res.Resources r0 = r3.getResources()
            r1 = 0
            java.lang.String r2 = "GoogleApiAvailability"
            switch(r4) {
                case 1: goto L7c;
                case 2: goto L75;
                case 3: goto L6e;
                case 4: goto L6d;
                case 5: goto L61;
                case 6: goto L6d;
                case 7: goto L55;
                case 8: goto L4f;
                case 9: goto L49;
                case 10: goto L43;
                case 11: goto L3d;
                case 12: goto La;
                case 13: goto La;
                case 14: goto La;
                case 15: goto La;
                case 16: goto L37;
                case 17: goto L2b;
                case 18: goto L6d;
                case 19: goto La;
                case 20: goto L1f;
                default: goto La;
            }
        La:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "Unexpected error code "
            r3.append(r0)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            android.util.Log.e(r2, r3)
            return r1
        L1f:
            java.lang.String r4 = "The current user profile is restricted and could not use authenticated features."
            android.util.Log.e(r2, r4)
            java.lang.String r4 = "common_google_play_services_restricted_profile_title"
            java.lang.String r3 = zah(r3, r4)
            return r3
        L2b:
            java.lang.String r4 = "The specified account could not be signed in."
            android.util.Log.e(r2, r4)
            java.lang.String r4 = "common_google_play_services_sign_in_failed_title"
            java.lang.String r3 = zah(r3, r4)
            return r3
        L37:
            java.lang.String r3 = "One of the API components you attempted to connect to is not available."
            android.util.Log.e(r2, r3)
            return r1
        L3d:
            java.lang.String r3 = "The application is not licensed to the user."
            android.util.Log.e(r2, r3)
            return r1
        L43:
            java.lang.String r3 = "Developer error occurred. Please see logs for detailed information"
            android.util.Log.e(r2, r3)
            return r1
        L49:
            java.lang.String r3 = "Google Play services is invalid. Cannot recover."
            android.util.Log.e(r2, r3)
            return r1
        L4f:
            java.lang.String r3 = "Internal error occurred. Please see logs for detailed information"
            android.util.Log.e(r2, r3)
            return r1
        L55:
            java.lang.String r4 = "Network error occurred. Please retry request later."
            android.util.Log.e(r2, r4)
            java.lang.String r4 = "common_google_play_services_network_error_title"
            java.lang.String r3 = zah(r3, r4)
            return r3
        L61:
            java.lang.String r4 = "An invalid account was specified when connecting. Please provide a valid account."
            android.util.Log.e(r2, r4)
            java.lang.String r4 = "common_google_play_services_invalid_account_title"
            java.lang.String r3 = zah(r3, r4)
            return r3
        L6d:
            return r1
        L6e:
            int r3 = com.google.android.gms.base.R.string.common_google_play_services_enable_title
            java.lang.String r3 = r0.getString(r3)
            return r3
        L75:
            int r3 = com.google.android.gms.base.R.string.common_google_play_services_update_title
            java.lang.String r3 = r0.getString(r3)
            return r3
        L7c:
            int r3 = com.google.android.gms.base.R.string.common_google_play_services_install_title
            java.lang.String r3 = r0.getString(r3)
            return r3
    }

    private static java.lang.String zag(android.content.Context r2, java.lang.String r3, java.lang.String r4) {
            android.content.res.Resources r0 = r2.getResources()
            java.lang.String r2 = zah(r2, r3)
            if (r2 != 0) goto L10
            int r2 = com.google.android.gms.common.R.string.common_google_play_services_unknown_issue
            java.lang.String r2 = r0.getString(r2)
        L10:
            android.content.res.Configuration r3 = r0.getConfiguration()
            java.util.Locale r3 = r3.locale
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r4
            java.lang.String r2 = java.lang.String.format(r3, r2, r0)
            return r2
    }

    private static java.lang.String zah(android.content.Context r4, java.lang.String r5) {
            androidx.collection.SimpleArrayMap r0 = com.google.android.gms.common.internal.zac.zaa
            monitor-enter(r0)
            android.content.res.Resources r1 = r4.getResources()     // Catch: java.lang.Throwable -> L7d
            android.content.res.Configuration r1 = r1.getConfiguration()     // Catch: java.lang.Throwable -> L7d
            androidx.core.os.LocaleListCompat r1 = androidx.core.os.ConfigurationCompat.getLocales(r1)     // Catch: java.lang.Throwable -> L7d
            r2 = 0
            java.util.Locale r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L7d
            java.util.Locale r2 = com.google.android.gms.common.internal.zac.zab     // Catch: java.lang.Throwable -> L7d
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Throwable -> L7d
            if (r2 != 0) goto L21
            r0.clear()     // Catch: java.lang.Throwable -> L7d
            com.google.android.gms.common.internal.zac.zab = r1     // Catch: java.lang.Throwable -> L7d
        L21:
            java.lang.Object r1 = r0.get(r5)     // Catch: java.lang.Throwable -> L7d
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L7d
            if (r1 == 0) goto L2b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7d
            return r1
        L2b:
            android.content.res.Resources r4 = com.google.android.gms.common.GooglePlayServicesUtil.getRemoteResource(r4)     // Catch: java.lang.Throwable -> L7d
            r1 = 0
            if (r4 != 0) goto L34
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7d
            return r1
        L34:
            java.lang.String r2 = "string"
            java.lang.String r3 = "com.google.android.gms"
            int r2 = r4.getIdentifier(r5, r2, r3)     // Catch: java.lang.Throwable -> L7d
            if (r2 != 0) goto L56
            java.lang.String r4 = "GoogleApiAvailability"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7d
            r2.<init>()     // Catch: java.lang.Throwable -> L7d
            java.lang.String r3 = "Missing resource: "
            r2.append(r3)     // Catch: java.lang.Throwable -> L7d
            r2.append(r5)     // Catch: java.lang.Throwable -> L7d
            java.lang.String r5 = r2.toString()     // Catch: java.lang.Throwable -> L7d
            android.util.Log.w(r4, r5)     // Catch: java.lang.Throwable -> L7d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7d
            return r1
        L56:
            java.lang.String r4 = r4.getString(r2)     // Catch: java.lang.Throwable -> L7d
            boolean r2 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L7d
            if (r2 == 0) goto L78
            java.lang.String r4 = "GoogleApiAvailability"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7d
            r2.<init>()     // Catch: java.lang.Throwable -> L7d
            java.lang.String r3 = "Got empty resource: "
            r2.append(r3)     // Catch: java.lang.Throwable -> L7d
            r2.append(r5)     // Catch: java.lang.Throwable -> L7d
            java.lang.String r5 = r2.toString()     // Catch: java.lang.Throwable -> L7d
            android.util.Log.w(r4, r5)     // Catch: java.lang.Throwable -> L7d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7d
            return r1
        L78:
            r0.put(r5, r4)     // Catch: java.lang.Throwable -> L7d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7d
            return r4
        L7d:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7d
            throw r4
    }
}
