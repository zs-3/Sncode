package androidx.room.util;

/* loaded from: classes.dex */
public class StringUtil {
    public static final java.lang.String[] EMPTY_STRING_ARRAY = null;

    static {
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            androidx.room.util.StringUtil.EMPTY_STRING_ARRAY = r0
            return
    }

    public static void appendPlaceholders(java.lang.StringBuilder r2, int r3) {
            r0 = 0
        L1:
            if (r0 >= r3) goto L14
            java.lang.String r1 = "?"
            r2.append(r1)
            int r1 = r3 + (-1)
            if (r0 >= r1) goto L11
            java.lang.String r1 = ","
            r2.append(r1)
        L11:
            int r0 = r0 + 1
            goto L1
        L14:
            return
    }

    public static java.lang.StringBuilder newStringBuilder() {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            return r0
    }
}
