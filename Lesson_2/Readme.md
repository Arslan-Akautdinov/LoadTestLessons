# Урок 2

## План занятия

- Groovy scripting
- Setup and teardown thread group
- Optimization jmeter.
- Report customization.

<br>


## Groovy doc

- language https://groovy-lang.org/documentation.html
- SampleResult https://jmeter.apache.org/api/org/apache/jmeter/samplers/SampleResult.html
- AssertionResult https://jmeter.apache.org/api/org/apache/jmeter/assertions/AssertionResult.html
- AllClasses https://jmeter.apache.org/api/index.html?org/apache/jmeter/functions/Groovy.html
- Work with var https://jmetervn.com/2016/12/05/jsr223-with-groovy-variables-part-1/
- JMetrUtils https://svn.apache.org/repos/asf/jmeter/branches/doc-v2_3_1/docs/api/org/apache/jmeter/util/JMeterUtils.html

## Graph add

sample_variables = QueueLength, DummyVariable

jmeter.reportgenerator.graph.custom_QueueLengthGraph.classname = org.apache.jmeter.report.processor.graph.impl.CustomGraphConsumer
jmeter.reportgenerator.graph.custom_QueueLengthGraph.title = my custom graph
jmeter.reportgenerator.graph.custom_QueueLengthGraph.property.set_Y_Axis = Variable value
jmeter.reportgenerator.graph.custom_QueueLengthGraph.property.set_X_Axis = Duration test
jmeter.reportgenerator.graph.custom_QueueLengthGraph.property.set_granularity = 1001
jmeter.reportgenerator.graph.custom_QueueLengthGraph.property.set_Sample_Variable_Name = QueueLength

docs:
- https://jmeter.apache.org/usermanual/generating-dashboard.html

# java heap

Heap dump
> java -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=<file-or-dir-path>

jmetr.bat
> set HEAP=-Xms1g -Xmx1g -XX:MaxMetaspaceSize=256m