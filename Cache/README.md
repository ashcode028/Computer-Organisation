# Cache Implementation
The translation between the logical address space and the physical memory is known
as Memory Mapping. To translate from logical to a physical address, to aid in memory
protection also to enable better management of memory resources are objectives of
memory mapping.
During cache mapping, the block is not brought from the main memory but the main
memory block is simply copied to the cache. Cache memory generally tends to operate
in some different configurations,
  1. Direct mapping
  2. Fully associative mapping
  3. Set associative mapping
 
 ## Direct Mapping
 In Direct mapped cache memory, each block mapped to exactly one location in cache
 memory.A particular block of main memory can map the line number of cache is given by -
 Cache line number = (Block Address of Main Memory) modulo (Number of lines in Cache)
 
 ![](https://github.com/ashcode028/Computer-Organisation/blob/e346c23fec0afc6d2f69bbaba6758d0805437d84/Cache/Direct1.png)
 ![](https://github.com/ashcode028/Computer-Organisation/blob/e346c23fec0afc6d2f69bbaba6758d0805437d84/Cache/Direct2.png)
 - The direct-mapped cache is like rows in a table with three columns' main memory
 address are bits for Offset, Index, and Tag. The size of the fields depends on the
 capacity of memory and size of the block in the cache.
  - The least significant w bits are used to identify a word within a block of main memory.
  Tags corresponding to the remaining bits are used to determine the proper block of
  main memory. Line off-set or block is used to select a block to be accessed out of total
  blocks available according to the capacity of the cache.
  - The data block or cache line that contains the actual data fetched and stored, a tag with
  all or part of the address of the data that was fetched, and a flag bit that shows the
  presence in the row entry of a valid bit of data.
  ## Associative Mapping
  In this type of mapping, any main memory block can go in any line of the cache. So we
have to use proper replacement policy to replace a block from the cache if the required
block of main memory is not present in the cache. Here, the main memory is divided
into two fields: word field identifies which word in the block is needed and the tag field
identifies the block. It is considered to be the fastest and the most flexible mapping form
of cache mapping.
![](https://github.com/ashcode028/Computer-Organisation/blob/575927726c798421cce52a22212c2418d317a741/Cache/Associative.png)
  ## Set-associative Mapping
  In this mapping technique, blocks of cache are grouped to form a set and a block of
main memory can go into any block of a specific set.
![](https://github.com/ashcode028/Computer-Organisation/blob/e346c23fec0afc6d2f69bbaba6758d0805437d84/Cache/set-associative.png)
- This form of mapping removes the drawbacks of direct mapping. In Set-associative
mapping, each word that is present in the cache can have two or more words in the
main memory for the same index address. Set associative cache mapping is a
combination of direct and associative cache mapping techniques.
- This also reduces searching overhead present in the associative mapping. Here,
searching is restricted to the number of sets instead of the number of blocks.
