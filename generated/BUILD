# This is a ridiculous genrule, but let's just pretend it were useful.
genrule (
	name = "generated",
	srcs = ["Generated.java", "//core"],
	outs = ["generated.jar"],
	cmd = """
		javac -cp $(location //core) $(location Generated.java) -d $(GENDIR)/generated
		jar cf $@ -C $(GENDIR)/generated .
	""",
	visibility = ["//visibility:public"],
)



# java_library (
# 	name = "generated",
# 	srcs = ["Generated.java"],
# 	deps = ["//core"],
# 	exports = ["//core"],
# 	visibility = ["//visibility:public"],
# )

