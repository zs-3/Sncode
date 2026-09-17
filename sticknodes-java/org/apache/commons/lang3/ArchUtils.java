package org.apache.commons.lang3;

/* loaded from: classes2.dex */
public class ArchUtils {
    private static final java.util.Map<java.lang.String, org.apache.commons.lang3.arch.Processor> ARCH_TO_PROCESSOR = null;

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            org.apache.commons.lang3.ArchUtils.ARCH_TO_PROCESSOR = r0
            init()
            return
    }

    public ArchUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    private static void addProcessor(java.lang.String r2, org.apache.commons.lang3.arch.Processor r3) {
            java.util.Map<java.lang.String, org.apache.commons.lang3.arch.Processor> r0 = org.apache.commons.lang3.ArchUtils.ARCH_TO_PROCESSOR
            boolean r1 = r0.containsKey(r2)
            if (r1 != 0) goto Lc
            r0.put(r2, r3)
            return
        Lc:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Key "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = " already exists in processor map"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r3.<init>(r2)
            throw r3
    }

    private static void addProcessors(org.apache.commons.lang3.arch.Processor r3, java.lang.String... r4) {
            int r0 = r4.length
            r1 = 0
        L2:
            if (r1 >= r0) goto Lc
            r2 = r4[r1]
            addProcessor(r2, r3)
            int r1 = r1 + 1
            goto L2
        Lc:
            return
    }

    public static org.apache.commons.lang3.arch.Processor getProcessor() {
            java.lang.String r0 = org.apache.commons.lang3.SystemUtils.OS_ARCH
            org.apache.commons.lang3.arch.Processor r0 = getProcessor(r0)
            return r0
    }

    public static org.apache.commons.lang3.arch.Processor getProcessor(java.lang.String r1) {
            java.util.Map<java.lang.String, org.apache.commons.lang3.arch.Processor> r0 = org.apache.commons.lang3.ArchUtils.ARCH_TO_PROCESSOR
            java.lang.Object r1 = r0.get(r1)
            org.apache.commons.lang3.arch.Processor r1 = (org.apache.commons.lang3.arch.Processor) r1
            return r1
    }

    private static void init() {
            init_X86_32Bit()
            init_X86_64Bit()
            init_IA64_32Bit()
            init_IA64_64Bit()
            init_PPC_32Bit()
            init_PPC_64Bit()
            return
    }

    private static void init_IA64_32Bit() {
            org.apache.commons.lang3.arch.Processor r0 = new org.apache.commons.lang3.arch.Processor
            org.apache.commons.lang3.arch.Processor$Arch r1 = org.apache.commons.lang3.arch.Processor.Arch.BIT_32
            org.apache.commons.lang3.arch.Processor$Type r2 = org.apache.commons.lang3.arch.Processor.Type.IA_64
            r0.<init>(r1, r2)
            java.lang.String r1 = "ia64_32"
            java.lang.String r2 = "ia64n"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2}
            addProcessors(r0, r1)
            return
    }

    private static void init_IA64_64Bit() {
            org.apache.commons.lang3.arch.Processor r0 = new org.apache.commons.lang3.arch.Processor
            org.apache.commons.lang3.arch.Processor$Arch r1 = org.apache.commons.lang3.arch.Processor.Arch.BIT_64
            org.apache.commons.lang3.arch.Processor$Type r2 = org.apache.commons.lang3.arch.Processor.Type.IA_64
            r0.<init>(r1, r2)
            java.lang.String r1 = "ia64"
            java.lang.String r2 = "ia64w"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2}
            addProcessors(r0, r1)
            return
    }

    private static void init_PPC_32Bit() {
            org.apache.commons.lang3.arch.Processor r0 = new org.apache.commons.lang3.arch.Processor
            org.apache.commons.lang3.arch.Processor$Arch r1 = org.apache.commons.lang3.arch.Processor.Arch.BIT_32
            org.apache.commons.lang3.arch.Processor$Type r2 = org.apache.commons.lang3.arch.Processor.Type.PPC
            r0.<init>(r1, r2)
            java.lang.String r1 = "ppc"
            java.lang.String r2 = "power"
            java.lang.String r3 = "powerpc"
            java.lang.String r4 = "power_pc"
            java.lang.String r5 = "power_rs"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2, r3, r4, r5}
            addProcessors(r0, r1)
            return
    }

    private static void init_PPC_64Bit() {
            org.apache.commons.lang3.arch.Processor r0 = new org.apache.commons.lang3.arch.Processor
            org.apache.commons.lang3.arch.Processor$Arch r1 = org.apache.commons.lang3.arch.Processor.Arch.BIT_64
            org.apache.commons.lang3.arch.Processor$Type r2 = org.apache.commons.lang3.arch.Processor.Type.PPC
            r0.<init>(r1, r2)
            java.lang.String r1 = "ppc64"
            java.lang.String r2 = "power64"
            java.lang.String r3 = "powerpc64"
            java.lang.String r4 = "power_pc64"
            java.lang.String r5 = "power_rs64"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2, r3, r4, r5}
            addProcessors(r0, r1)
            return
    }

    private static void init_X86_32Bit() {
            org.apache.commons.lang3.arch.Processor r0 = new org.apache.commons.lang3.arch.Processor
            org.apache.commons.lang3.arch.Processor$Arch r1 = org.apache.commons.lang3.arch.Processor.Arch.BIT_32
            org.apache.commons.lang3.arch.Processor$Type r2 = org.apache.commons.lang3.arch.Processor.Type.X86
            r0.<init>(r1, r2)
            java.lang.String r3 = "x86"
            java.lang.String r4 = "i386"
            java.lang.String r5 = "i486"
            java.lang.String r6 = "i586"
            java.lang.String r7 = "i686"
            java.lang.String r8 = "pentium"
            java.lang.String[] r1 = new java.lang.String[]{r3, r4, r5, r6, r7, r8}
            addProcessors(r0, r1)
            return
    }

    private static void init_X86_64Bit() {
            org.apache.commons.lang3.arch.Processor r0 = new org.apache.commons.lang3.arch.Processor
            org.apache.commons.lang3.arch.Processor$Arch r1 = org.apache.commons.lang3.arch.Processor.Arch.BIT_64
            org.apache.commons.lang3.arch.Processor$Type r2 = org.apache.commons.lang3.arch.Processor.Type.X86
            r0.<init>(r1, r2)
            java.lang.String r1 = "x86_64"
            java.lang.String r2 = "amd64"
            java.lang.String r3 = "em64t"
            java.lang.String r4 = "universal"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2, r3, r4}
            addProcessors(r0, r1)
            return
    }
}
