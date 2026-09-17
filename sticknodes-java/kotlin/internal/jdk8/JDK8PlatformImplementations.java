package kotlin.internal.jdk8;

/* compiled from: JDK8PlatformImplementations.kt */
/* loaded from: classes2.dex */
public class JDK8PlatformImplementations extends kotlin.internal.jdk7.JDK7PlatformImplementations {

    /* compiled from: JDK8PlatformImplementations.kt */
    private static final class ReflectSdkVersion {
        public static final kotlin.internal.jdk8.JDK8PlatformImplementations.ReflectSdkVersion INSTANCE = null;
        public static final java.lang.Integer sdkVersion = null;

        static {
                kotlin.internal.jdk8.JDK8PlatformImplementations$ReflectSdkVersion r0 = new kotlin.internal.jdk8.JDK8PlatformImplementations$ReflectSdkVersion
                r0.<init>()
                kotlin.internal.jdk8.JDK8PlatformImplementations.ReflectSdkVersion.INSTANCE = r0
                r0 = 0
                java.lang.String r1 = "android.os.Build$VERSION"
                java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L1f
                java.lang.String r2 = "SDK_INT"
                java.lang.reflect.Field r1 = r1.getField(r2)     // Catch: java.lang.Throwable -> L1f
                java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> L1f
                boolean r2 = r1 instanceof java.lang.Integer     // Catch: java.lang.Throwable -> L1f
                if (r2 == 0) goto L1f
                java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L1f
                goto L20
            L1f:
                r1 = r0
            L20:
                if (r1 == 0) goto L2e
                int r2 = r1.intValue()
                if (r2 <= 0) goto L2a
                r2 = 1
                goto L2b
            L2a:
                r2 = 0
            L2b:
                if (r2 == 0) goto L2e
                r0 = r1
            L2e:
                kotlin.internal.jdk8.JDK8PlatformImplementations.ReflectSdkVersion.sdkVersion = r0
                return
        }

        private ReflectSdkVersion() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public JDK8PlatformImplementations() {
            r0 = this;
            r0.<init>()
            return
    }

    private final boolean sdkIsNullOrAtLeast(int r2) {
            r1 = this;
            java.lang.Integer r0 = kotlin.internal.jdk8.JDK8PlatformImplementations.ReflectSdkVersion.sdkVersion
            if (r0 == 0) goto Ld
            int r0 = r0.intValue()
            if (r0 < r2) goto Lb
            goto Ld
        Lb:
            r2 = 0
            goto Le
        Ld:
            r2 = 1
        Le:
            return r2
    }

    @Override // kotlin.internal.PlatformImplementations
    public kotlin.random.Random defaultPlatformRandom() {
            r1 = this;
            r0 = 34
            boolean r0 = r1.sdkIsNullOrAtLeast(r0)
            if (r0 == 0) goto Le
            kotlin.random.jdk8.PlatformThreadLocalRandom r0 = new kotlin.random.jdk8.PlatformThreadLocalRandom
            r0.<init>()
            goto L12
        Le:
            kotlin.random.Random r0 = super.defaultPlatformRandom()
        L12:
            return r0
    }
}
